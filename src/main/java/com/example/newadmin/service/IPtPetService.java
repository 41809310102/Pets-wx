package com.example.newadmin.service;

import java.util.List;
import com.example.newadmin.domain.PtPet;

/**
 * 宠物信息表Service接口
 *
 * @author root
 * @date 2023-01-26
 */
public interface IPtPetService
{
    /**
     * 查询宠物信息表
     *
     * @param id 宠物信息表主键
     * @return 宠物信息表
     */
    public PtPet selectPtPetById(Long id);

    /**
     * 查询宠物信息表列表
     *
     * @param ptPet 宠物信息表
     * @return 宠物信息表集合
     */
    public List<PtPet> selectPtPetList(PtPet ptPet);

    /**
     * 新增宠物信息表
     *
     * @param ptPet 宠物信息表
     * @return 结果
     */
    public int insertPtPet(PtPet ptPet);

    /**
     * 修改宠物信息表
     *
     * @param ptPet 宠物信息表
     * @return 结果
     */
    public int updatePtPet(PtPet ptPet);

    /**
     * 批量删除宠物信息表
     *
     * @param ids 需要删除的宠物信息表主键集合
     * @return 结果
     */
    public int deletePtPetByIds(String ids);

    /**
     * 删除宠物信息表信息
     *
     * @param id 宠物信息表主键
     * @return 结果
     */
    public int deletePtPetById(Long id);
}
