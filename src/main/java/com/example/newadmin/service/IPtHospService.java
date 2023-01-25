package com.example.newadmin.service;

import java.util.List;
import com.example.newadmin.domain.PtHosp;

/**
 * 宠物医院信息表Service接口
 *
 * @author root
 * @date 2023-01-25
 */
public interface IPtHospService
{
    /**
     * 查询宠物医院信息表
     *
     * @param id 宠物医院信息表主键
     * @return 宠物医院信息表
     */
    public PtHosp selectPtHospById(Long id);

    /**
     * 查询宠物医院信息表列表
     *
     * @param ptHosp 宠物医院信息表
     * @return 宠物医院信息表集合
     */
    public List<PtHosp> selectPtHospList(PtHosp ptHosp);

    /**
     * 新增宠物医院信息表
     *
     * @param ptHosp 宠物医院信息表
     * @return 结果
     */
    public int insertPtHosp(PtHosp ptHosp);

    /**
     * 修改宠物医院信息表
     *
     * @param ptHosp 宠物医院信息表
     * @return 结果
     */
    public int updatePtHosp(PtHosp ptHosp);

    /**
     * 批量删除宠物医院信息表
     *
     * @param ids 需要删除的宠物医院信息表主键集合
     * @return 结果
     */
    public int deletePtHospByIds(String ids);

    /**
     * 删除宠物医院信息表信息
     *
     * @param id 宠物医院信息表主键
     * @return 结果
     */
    public int deletePtHospById(Long id);
}
