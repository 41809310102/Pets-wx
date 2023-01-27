package com.example.newadmin.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.newadmin.mapper.PtFuwuShopMapper;
import com.example.newadmin.domain.PtFuwuShop;
import com.example.newadmin.service.IPtFuwuShopService;

/**
 * 预约订单数据Service业务层处理
 *
 * @author root
 * @date 2023-01-26
 */
@Service
public class PtFuwuShopServiceImpl implements IPtFuwuShopService
{
    @Autowired
    private PtFuwuShopMapper ptFuwuShopMapper;

    /**
     * 查询预约订单数据
     *
     * @param id 预约订单数据主键
     * @return 预约订单数据
     */
    @Override
    public PtFuwuShop selectPtFuwuShopById(Long id)
    {
        return ptFuwuShopMapper.selectPtFuwuShopById(id);
    }

    /**
     * 查询预约订单数据列表
     *
     * @param ptFuwuShop 预约订单数据
     * @return 预约订单数据
     */
    @Override
    public List<PtFuwuShop> selectPtFuwuShopList(PtFuwuShop ptFuwuShop)
    {
        return ptFuwuShopMapper.selectPtFuwuShopList(ptFuwuShop);
    }

    /**
     * 新增预约订单数据
     *
     * @param ptFuwuShop 预约订单数据
     * @return 结果
     */
    @Override
    public int insertPtFuwuShop(PtFuwuShop ptFuwuShop)
    {
        return ptFuwuShopMapper.insertPtFuwuShop(ptFuwuShop);
    }

    /**
     * 修改预约订单数据
     *
     * @param ptFuwuShop 预约订单数据
     * @return 结果
     */
    @Override
    public int updatePtFuwuShop(PtFuwuShop ptFuwuShop)
    {
        return ptFuwuShopMapper.updatePtFuwuShop(ptFuwuShop);
    }

    /**
     * 批量删除预约订单数据
     *
     * @param ids 需要删除的预约订单数据主键
     * @return 结果
     */
    @Override
    public int deletePtFuwuShopByIds(String ids)
    {
        return ptFuwuShopMapper.deletePtFuwuShopByIds(new String[3]);
    }

    /**
     * 删除预约订单数据信息
     *
     * @param id 预约订单数据主键
     * @return 结果
     */
    @Override
    public int deletePtFuwuShopById(Long id)
    {
        return ptFuwuShopMapper.deletePtFuwuShopById(id);
    }
}
