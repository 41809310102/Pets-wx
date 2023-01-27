package com.example.newadmin.service;

import java.util.List;
import com.example.newadmin.domain.PtFuwu;

/**
 * 医院服务信息表Service接口
 *
 * @author root
 * @date 2023-01-26
 */
public interface IPtFuwuService
{
    /**
     * 查询医院服务信息表
     *
     * @param id 医院服务信息表主键
     * @return 医院服务信息表
     */
    public PtFuwu selectPtFuwuById(Long id);

    /**
     * 查询医院服务信息表列表
     *
     * @param ptFuwu 医院服务信息表
     * @return 医院服务信息表集合
     */
    public List<PtFuwu> selectPtFuwuList(PtFuwu ptFuwu);

    /**
     * 新增医院服务信息表
     *
     * @param ptFuwu 医院服务信息表
     * @return 结果
     */
    public int insertPtFuwu(PtFuwu ptFuwu);

    /**
     * 修改医院服务信息表
     *
     * @param ptFuwu 医院服务信息表
     * @return 结果
     */
    public int updatePtFuwu(PtFuwu ptFuwu);

    /**
     * 批量删除医院服务信息表
     *
     * @param ids 需要删除的医院服务信息表主键集合
     * @return 结果
     */
    public int deletePtFuwuByIds(String ids);

    /**
     * 删除医院服务信息表信息
     *
     * @param id 医院服务信息表主键
     * @return 结果
     */
    public int deletePtFuwuById(Long id);
}
