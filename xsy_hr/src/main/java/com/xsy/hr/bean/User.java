package com.xsy.hr.bean;

import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.sql.Date;

/**
 * @author Xsy
 * @create 2020 - 07 - 04 - 10:00
 * @version:1.0
 **/

@TableName("user")//@TableName中的值对应着表名
public class User implements Serializable {
    private static final long serialVersionUID = 3930067543199756150L;
    private Long id;//员工编号
    private String userName;//员工用户名
    private String password;//登录密码
    private Byte sex;//性别
    private Date birthday;//生日
    private Date createTime;//创建时间
    private Byte ISAdmin;//是否为管理员
    private String content;//人员简介/省略属性的setter和getter方法

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Byte getISAdmin() {
        return ISAdmin;
    }

    public void setISAdmin(Byte ISAdmin) {
        this.ISAdmin = ISAdmin;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", sex=" + sex +
                ", birthday=" + birthday +
                ", createTime=" + createTime +
                ", ISAdmin=" + ISAdmin +
                ", content='" + content + '\'' +
                '}';
    }
}
