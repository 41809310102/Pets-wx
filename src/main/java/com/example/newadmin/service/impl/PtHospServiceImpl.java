package com.example.newadmin.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.newadmin.mapper.PtHospMapper;
import com.example.newadmin.domain.PtHosp;
import com.example.newadmin.service.IPtHospService;


/**
 * 宠物医院信息表Service业务层处理
 *
 * @author root
 * @date 2023-01-25
 */
@Service
public class PtHospServiceImpl implements IPtHospService
{
    @Autowired
    private PtHospMapper ptHospMapper;

    /**
     * 查询宠物医院信息表
     *
     * @param id 宠物医院信息表主键
     * @return 宠物医院信息表
     */
    @Override
    public PtHosp selectPtHospById(Long id)
    {
        return ptHospMapper.selectPtHospById(id);
    }

    /**
     * 查询宠物医院信息表列表
     *
     * @param ptHosp 宠物医院信息表
     * @return 宠物医院信息表
     */
    @Override
    public List<PtHosp> selectPtHospList(PtHosp ptHosp)
    {
        return ptHospMapper.selectPtHospList(ptHosp);
    }

    /**
     * 新增宠物医院信息表
     *
     * @param ptHosp 宠物医院信息表
     * @return 结果
     */
    @Override
    public int insertPtHosp(PtHosp ptHosp)
    {
        return ptHospMapper.insertPtHosp(ptHosp);
    }

    /**
     * 修改宠物医院信息表
     *
     * @param ptHosp 宠物医院信息表
     * @return 结果
     */
    @Override
    public int updatePtHosp(PtHosp ptHosp)
    {
        return ptHospMapper.updatePtHosp(ptHosp);
    }

    /**
     * 批量删除宠物医院信息表
     *
     * @param ids 需要删除的宠物医院信息表主键
     * @return 结果
     */
    @Override
    public int deletePtHospByIds(String ids)
    {
        return ptHospMapper.deletePtHospByIds(new String[9]);
    }

    /**
     * 删除宠物医院信息表信息
     *
     * @param id 宠物医院信息表主键
     * @return 结果
     */
    @Override
    public int deletePtHospById(Long id)
    {
        return ptHospMapper.deletePtHospById(id);
    }
}
