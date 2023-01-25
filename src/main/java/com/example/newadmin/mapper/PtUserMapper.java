package com.example.newadmin.mapper;

import java.util.List;
import com.example.newadmin.domain.PtUser;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户信息Mapper接口
 *
 * @author user
 * @date 2023-01-25
 */
@Mapper
public interface PtUserMapper
{
    /**
     * 查询用户信息
     *
     * @param id 用户信息主键
     * @return 用户信息
     */
    public PtUser selectPtUserById(Long id);

    /**
     * 查询用户信息列表
     *
     * @param ptUser 用户信息
     * @return 用户信息集合
     */
    public List<PtUser> selectPtUserList(PtUser ptUser);

    /**
     * 新增用户信息
     *
     * @param ptUser 用户信息
     * @return 结果
     */
    public int insertPtUser(PtUser ptUser);

    /**
     * 修改用户信息
     *
     * @param ptUser 用户信息
     * @return 结果
     */
    public int updatePtUser(PtUser ptUser);

    /**
     * 删除用户信息
     *
     * @param id 用户信息主键
     * @return 结果
     */
    public int deletePtUserById(Long id);

    /**
     * 批量删除用户信息
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deletePtUserByIds(String[] ids);
}
