package com.example.newadmin.mapper;

import java.util.List;
import com.example.newadmin.domain.PtFuwuShop;
import org.apache.ibatis.annotations.Mapper;

/**
 * 服务信息Mapper接口
 *
 * @author root
 * @date 2023-01-26
 */
@Mapper
public interface PtFuwuShopMapper
{
    /**
     * 查询服务信息
     *
     * @param id 服务信息主键
     * @return 服务信息
     */
    public PtFuwuShop selectPtFuwuShopById(Long id);

    /**
     * 查询服务信息列表
     *
     * @param ptFuwuShop 服务信息
     * @return 服务信息集合
     */
    public List<PtFuwuShop> selectPtFuwuShopList(PtFuwuShop ptFuwuShop);

    /**
     * 新增服务信息
     *
     * @param ptFuwuShop 服务信息
     * @return 结果
     */
    public int insertPtFuwuShop(PtFuwuShop ptFuwuShop);

    /**
     * 修改服务信息
     *
     * @param ptFuwuShop 服务信息
     * @return 结果
     */
    public int updatePtFuwuShop(PtFuwuShop ptFuwuShop);

    /**
     * 删除服务信息
     *
     * @param id 服务信息主键
     * @return 结果
     */
    public int deletePtFuwuShopById(Long id);

    /**
     * 批量删除服务信息
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deletePtFuwuShopByIds(String[] ids);
}
