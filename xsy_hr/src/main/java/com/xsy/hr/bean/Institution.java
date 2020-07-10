package com.xsy.hr.bean;

import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.sql.Date;

/**
 * @author Xsy
 * @create 2020 - 06 - 28 - 16:18
 * @version:1.0
 **/
@TableName("institution")
public class Institution implements Serializable {
    private static final long serialVersionUID = -5501002813078894498L;
    private Long id;//奖惩编号
    private String name;//奖惩名称
    private String reason;//奖惩原因
    private String explains;//奖惩说明
    private Date createTime;//创建时间


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getExplains() {
        return explains;
    }

    public void setExplains(String explains) {
        this.explains = explains;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Institution{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", reason='" + reason + '\'' +
                ", explains='" + explains + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}