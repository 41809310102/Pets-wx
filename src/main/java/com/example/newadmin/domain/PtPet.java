package com.example.newadmin.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * 宠物列表对象 pt_pet
 *
 * @author root
 * @date 2023-01-27
 */
public class PtPet
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 宠物名称 */
    private String petName;

    /** 宠物年龄 */
    private String petAge;

    /** 性别 */
    private String sex;

    /** 图片 */
    private String pic;

    /** 生日 */
    private String birthTime;

    /** 主人id */
    private Long masterId;

    /** 宠物类型 */
    private String type;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setPetName(String petName)
    {
        this.petName = petName;
    }

    public String getPetName()
    {
        return petName;
    }
    public void setPetAge(String petAge)
    {
        this.petAge = petAge;
    }

    public String getPetAge()
    {
        return petAge;
    }
    public void setSex(String sex)
    {
        this.sex = sex;
    }

    public String getSex()
    {
        return sex;
    }
    public void setPic(String pic)
    {
        this.pic = pic;
    }

    public String getPic()
    {
        return pic;
    }
    public void setBirthTime(String birthTime)
    {
        this.birthTime = birthTime;
    }

    public String getBirthTime()
    {
        return birthTime;
    }
    public void setMasterId(Long masterId)
    {
        this.masterId = masterId;
    }

    public Long getMasterId()
    {
        return masterId;
    }
    public void setType(String type)
    {
        this.type = type;
    }

    public String getType()
    {
        return type;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("petName", getPetName())
                .append("petAge", getPetAge())
                .append("sex", getSex())
                .append("pic", getPic())
                .append("birthTime", getBirthTime())
                .append("masterId", getMasterId())
                .append("type", getType())
                .toString();
    }
}
