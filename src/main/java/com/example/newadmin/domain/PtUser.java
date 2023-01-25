package com.example.newadmin.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * 用户信息对象 pt_user
 *
 * @author user
 * @date 2023-01-25
 */
public class PtUser
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 用户名称 */
    private String username;

    /** 用户密码 */
    private String password;

    /** 用户性别 */
    private String sex;

    /** 用户电话 */
    private String phone;

    /** 创建时间 */
    private String birthTime;

    /** 用户权限 */
    private Long root;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getUsername()
    {
        return username;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getPassword()
    {
        return password;
    }
    public void setSex(String sex)
    {
        this.sex = sex;
    }

    public String getSex()
    {
        return sex;
    }
    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public String getPhone()
    {
        return phone;
    }
    public void setBirthTime(String birthTime)
    {
        this.birthTime = birthTime;
    }

    public String getBirthTime()
    {
        return birthTime;
    }
    public void setRoot(Long root)
    {
        this.root = root;
    }

    public Long getRoot()
    {
        return root;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("username", getUsername())
                .append("password", getPassword())
                .append("sex", getSex())
                .append("phone", getPhone())
                .append("birthTime", getBirthTime())
                .append("root", getRoot())
                .toString();
    }
}
