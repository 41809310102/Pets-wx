package com.example.newadmin.service;

import java.util.List;
import com.example.newadmin.domain.PtOrder;

/**
 * 预约订单信息Service接口
 *
 * @author root
 * @date 2023-01-26
 */
public interface IPtOrderService
{
    /**
     * 查询预约订单信息
     *
     * @param id 预约订单信息主键
     * @return 预约订单信息
     */
    public PtOrder selectPtOrderById(Long id);

    /**
     * 查询预约订单信息列表
     *
     * @param ptOrder 预约订单信息
     * @return 预约订单信息集合
     */
    public List<PtOrder> selectPtOrderList(PtOrder ptOrder);

    /**
     * 新增预约订单信息
     *
     * @param ptOrder 预约订单信息
     * @return 结果
     */
    public int insertPtOrder(PtOrder ptOrder);

    /**
     * 修改预约订单信息
     *
     * @param ptOrder 预约订单信息
     * @return 结果
     */
    public int updatePtOrder(PtOrder ptOrder);

    /**
     * 批量删除预约订单信息
     *
     * @param ids 需要删除的预约订单信息主键集合
     * @return 结果
     */
    public int deletePtOrderByIds(String ids);

    /**
     * 删除预约订单信息信息
     *
     * @param id 预约订单信息主键
     * @return 结果
     */
    public int deletePtOrderById(Long id);
}
