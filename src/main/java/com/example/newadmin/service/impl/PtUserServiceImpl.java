package com.example.newadmin.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.newadmin.mapper.PtUserMapper;
import com.example.newadmin.domain.PtUser;
import com.example.newadmin.service.IPtUserService;


/**
 * 用户信息Service业务层处理
 *
 * @author user
 * @date 2023-01-25
 */
@Service
public class PtUserServiceImpl implements IPtUserService
{
    @Autowired
    private PtUserMapper ptUserMapper;

    /**
     * 查询用户信息
     *
     * @param id 用户信息主键
     * @return 用户信息
     */
    @Override
    public PtUser selectPtUserById(Long id)
    {
        return ptUserMapper.selectPtUserById(id);
    }

    /**
     * 查询用户信息列表
     *
     * @param ptUser 用户信息
     * @return 用户信息
     */
    @Override
    public List<PtUser> selectPtUserList(PtUser ptUser)
    {
        return ptUserMapper.selectPtUserList(ptUser);
    }

    /**
     * 新增用户信息
     *
     * @param ptUser 用户信息
     * @return 结果
     */
    @Override
    public int insertPtUser(PtUser ptUser)
    {
        return ptUserMapper.insertPtUser(ptUser);
    }

    /**
     * 修改用户信息
     *
     * @param ptUser 用户信息
     * @return 结果
     */
    @Override
    public int updatePtUser(PtUser ptUser)
    {
        return ptUserMapper.updatePtUser(ptUser);
    }

    /**
     * 批量删除用户信息
     *
     * @param ids 需要删除的用户信息主键
     * @return 结果
     */
    @Override
    public int deletePtUserByIds(String ids)
    {
        return ptUserMapper.deletePtUserByIds(new String[5]);
    }

    /**
     * 删除用户信息信息
     *
     * @param id 用户信息主键
     * @return 结果
     */
    @Override
    public int deletePtUserById(Long id)
    {
        return ptUserMapper.deletePtUserById(id);
    }
}
