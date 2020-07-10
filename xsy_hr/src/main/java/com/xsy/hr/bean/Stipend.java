package com.xsy.hr.bean;

import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.sql.Date;

/**
 * @author Xsy
 * @create 2020 - 06 - 28 - 16:21
 * @version:1.0
 **/
@TableName("stipend")
public class Stipend implements Serializable {
    private Long id;//薪金信息编号
    private String name; //员工姓名
    private Float basic;//基本薪金
    private Float eat;//饭补
    private Float house;//房补
    private Date grantTime;//工资发放时间
    private Float duty;//全勤奖
    private Float scot;//赋税
    private Float punishment; //罚款
    private Float other;//额外补助
    private Float totalSize; //总

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

    public Float getBasic() {
        return basic;
    }

    public void setBasic(Float basic) {
        this.basic = basic;
    }

    public Float getEat() {
        return eat;
    }

    public void setEat(Float eat) {
        this.eat = eat;
    }

    public Float getHouse() {
        return house;
    }

    public void setHouse(Float house) {
        this.house = house;
    }

    public Date getGrantTime() {
        return grantTime;
    }

    public void setGrantTime(Date grantTime) {
        this.grantTime = grantTime;
    }

    public Float getDuty() {
        return duty;
    }

    public void setDuty(Float duty) {
        this.duty = duty;
    }

    public Float getScot() {
        return scot;
    }

    public void setScot(Float scot) {
        this.scot = scot;
    }

    public Float getPunishment() {
        return punishment;
    }

    public void setPunishment(Float punishment) {
        this.punishment = punishment;
    }

    public Float getOther() {
        return other;
    }

    public void setOther(Float other) {
        this.other = other;
    }

    public Float getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(Float totalSize) {
        this.totalSize = totalSize;
    }

    @Override
    public String toString() {
        return "Stipend{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", basic=" + basic +
                ", eat=" + eat +
                ", house=" + house +
                ", grantTime=" + grantTime +
                ", duty=" + duty +
                ", scot=" + scot +
                ", punishment=" + punishment +
                ", other=" + other +
                ", totalSize=" + totalSize +
                '}';
    }
}
