package com.example.newadmin.service;

import java.util.List;
import com.example.newadmin.domain.PtFuwuShop;

/**
 * 预约订单数据Service接口
 *
 * @author root
 * @date 2023-01-26
 */
public interface IPtFuwuShopService
{
    /**
     * 查询预约订单数据
     *
     * @param id 预约订单数据主键
     * @return 预约订单数据
     */
    public PtFuwuShop selectPtFuwuShopById(Long id);

    /**
     * 查询预约订单数据列表
     *
     * @param ptFuwuShop 预约订单数据
     * @return 预约订单数据集合
     */
    public List<PtFuwuShop> selectPtFuwuShopList(PtFuwuShop ptFuwuShop);

    /**
     * 新增预约订单数据
     *
     * @param ptFuwuShop 预约订单数据
     * @return 结果
     */
    public int insertPtFuwuShop(PtFuwuShop ptFuwuShop);

    /**
     * 修改预约订单数据
     *
     * @param ptFuwuShop 预约订单数据
     * @return 结果
     */
    public int updatePtFuwuShop(PtFuwuShop ptFuwuShop);

    /**
     * 批量删除预约订单数据
     *
     * @param ids 需要删除的预约订单数据主键集合
     * @return 结果
     */
    public int deletePtFuwuShopByIds(String ids);

    /**
     * 删除预约订单数据信息
     *
     * @param id 预约订单数据主键
     * @return 结果
     */
    public int deletePtFuwuShopById(Long id);
}
