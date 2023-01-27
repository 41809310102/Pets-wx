package com.example.newadmin.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.newadmin.mapper.PtOrderMapper;
import com.example.newadmin.domain.PtOrder;
import com.example.newadmin.service.IPtOrderService;


/**
 * 预约订单信息Service业务层处理
 *
 * @author root
 * @date 2023-01-26
 */
@Service
public class PtOrderServiceImpl implements IPtOrderService
{
    @Autowired
    private PtOrderMapper ptOrderMapper;

    /**
     * 查询预约订单信息
     *
     * @param id 预约订单信息主键
     * @return 预约订单信息
     */
    @Override
    public PtOrder selectPtOrderById(Long id)
    {
        return ptOrderMapper.selectPtOrderById(id);
    }

    /**
     * 查询预约订单信息列表
     *
     * @param ptOrder 预约订单信息
     * @return 预约订单信息
     */
    @Override
    public List<PtOrder> selectPtOrderList(PtOrder ptOrder)
    {
        return ptOrderMapper.selectPtOrderList(ptOrder);
    }

    /**
     * 新增预约订单信息
     *
     * @param ptOrder 预约订单信息
     * @return 结果
     */
    @Override
    public int insertPtOrder(PtOrder ptOrder)
    {
        return ptOrderMapper.insertPtOrder(ptOrder);
    }

    /**
     * 修改预约订单信息
     *
     * @param ptOrder 预约订单信息
     * @return 结果
     */
    @Override
    public int updatePtOrder(PtOrder ptOrder)
    {
        return ptOrderMapper.updatePtOrder(ptOrder);
    }

    /**
     * 批量删除预约订单信息
     *
     * @param ids 需要删除的预约订单信息主键
     * @return 结果
     */
    @Override
    public int deletePtOrderByIds(String ids)
    {
        String[] str = ids.split(",");
        return ptOrderMapper.deletePtOrderByIds(str);
    }

    /**
     * 删除预约订单信息信息
     *
     * @param id 预约订单信息主键
     * @return 结果
     */
    @Override
    public int deletePtOrderById(Long id)
    {
        return ptOrderMapper.deletePtOrderById(id);
    }
}
