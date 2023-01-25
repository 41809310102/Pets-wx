package com.example.newadmin.mapper;

import java.util.List;
import com.example.newadmin.domain.PtHosp;
import org.apache.ibatis.annotations.Mapper;

/**
 * 宠物医院信息表Mapper接口
 *
 * @author root
 * @date 2023-01-25
 */
@Mapper
public interface PtHospMapper
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
     * 删除宠物医院信息表
     *
     * @param id 宠物医院信息表主键
     * @return 结果
     */
    public int deletePtHospById(Long id);

    /**
     * 批量删除宠物医院信息表
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deletePtHospByIds(String[] ids);
}
