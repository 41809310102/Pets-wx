package com.example.newadmin.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * 宠物医院信息表对象 pt_hosp
 *
 * @author root
 * @date 2023-01-25
 */
public class PtHosp
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 医院名称 */
    private String hospName;

    /** 医院地址 */
    private String hospLocal;

    /** 医院logo */
    private String pic;

    /** 医院描述 */
    private String hospDesc;

    /** 服务价格 */
    private Long price;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setHospName(String hospName)
    {
        this.hospName = hospName;
    }

    public String getHospName()
    {
        return hospName;
    }
    public void setHospLocal(String hospLocal)
    {
        this.hospLocal = hospLocal;
    }

    public String getHospLocal()
    {
        return hospLocal;
    }
    public void setPic(String pic)
    {
        this.pic = pic;
    }

    public String getPic()
    {
        return pic;
    }
    public void setHospDesc(String hospDesc)
    {
        this.hospDesc = hospDesc;
    }

    public String getHospDesc()
    {
        return hospDesc;
    }
    public void setPrice(Long price)
    {
        this.price = price;
    }

    public Long getPrice()
    {
        return price;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("hospName", getHospName())
                .append("hospLocal", getHospLocal())
                .append("pic", getPic())
                .append("hospDesc", getHospDesc())
                .append("price", getPrice())
                .toString();
    }
}
