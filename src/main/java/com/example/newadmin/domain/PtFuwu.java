package com.example.newadmin.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * 医院服务信息表对象 pt_fuwu
 *
 * @author root
 * @date 2023-01-26
 */
public class PtFuwu
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** logo */
    private String pic;

    /** 标题 */
    private String name;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setPic(String pic)
    {
        this.pic = pic;
    }

    public String getPic()
    {
        return pic;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("pic", getPic())
                .append("name", getName())
                .toString();
    }
}
