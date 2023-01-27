package com.example.newadmin.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.newadmin.mapper.PtPetMapper;
import com.example.newadmin.domain.PtPet;
import com.example.newadmin.service.IPtPetService;


/**
 * 宠物信息表Service业务层处理
 *
 * @author root
 * @date 2023-01-26
 */
@Service
public class PtPetServiceImpl implements IPtPetService
{
    @Autowired
    private PtPetMapper ptPetMapper;

    /**
     * 查询宠物信息表
     *
     * @param id 宠物信息表主键
     * @return 宠物信息表
     */
    @Override
    public PtPet selectPtPetById(Long id)
    {
        return ptPetMapper.selectPtPetById(id);
    }

    /**
     * 查询宠物信息表列表
     *
     * @param ptPet 宠物信息表
     * @return 宠物信息表
     */
    @Override
    public List<PtPet> selectPtPetList(PtPet ptPet)
    {
        return ptPetMapper.selectPtPetList(ptPet);
    }

    /**
     * 新增宠物信息表
     *
     * @param ptPet 宠物信息表
     * @return 结果
     */
    @Override
    public int insertPtPet(PtPet ptPet)
    {
        return ptPetMapper.insertPtPet(ptPet);
    }

    /**
     * 修改宠物信息表
     *
     * @param ptPet 宠物信息表
     * @return 结果
     */
    @Override
    public int updatePtPet(PtPet ptPet)
    {
        return ptPetMapper.updatePtPet(ptPet);
    }

    /**
     * 批量删除宠物信息表
     *
     * @param ids 需要删除的宠物信息表主键
     * @return 结果
     */
    @Override
    public int deletePtPetByIds(String ids)
    {
        return ptPetMapper.deletePtPetByIds(new String[6]);
    }

    /**
     * 删除宠物信息表信息
     *
     * @param id 宠物信息表主键
     * @return 结果
     */
    @Override
    public int deletePtPetById(Long id)
    {
        return ptPetMapper.deletePtPetById(id);
    }
}
