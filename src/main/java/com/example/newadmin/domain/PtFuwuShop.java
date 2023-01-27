package com.example.newadmin.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * 服务信息对象 pt_fuwu_shop
 *
 * @author root
 * @date 2023-01-26
 */
public class PtFuwuShop
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 父服务 */
    private Long fid;

    /** 标题 */
    private String title;

    /** 预约详情 */
    private String shopDesc;

    /** 价格 */
    private String price;

    /** 图片 */
    private String pic;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setFid(Long fid)
    {
        this.fid = fid;
    }

    public Long getFid()
    {
        return fid;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getTitle()
    {
        return title;
    }
    public void setShopDesc(String shopDesc)
    {
        this.shopDesc = shopDesc;
    }

    public String getShopDesc()
    {
        return shopDesc;
    }
    public void setPrice(String price)
    {
        this.price = price;
    }

    public String getPrice()
    {
        return price;
    }
    public void setPic(String pic)
    {
        this.pic = pic;
    }

    public String getPic()
    {
        return pic;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("fid", getFid())
                .append("title", getTitle())
                .append("shopDesc", getShopDesc())
                .append("price", getPrice())
                .append("pic", getPic())
                .toString();
    }
}
