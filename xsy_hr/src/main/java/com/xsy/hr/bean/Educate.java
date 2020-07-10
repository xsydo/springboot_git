package com.xsy.hr.bean;

import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.sql.Date;

/**
 * @author Xsy
 * @create 2020 - 06 - 28 - 16:13
 * @version:1.0
 **/

@TableName("educate")
public class Educate implements Serializable {
    private static final long serialVersionUID = 6951133136974341679L;
    private Long id;//培训编号水
    private String name;//培训名称
    private String purpose;//培训目的
    private Date beginTime;//培训开始时间
    private Date endTime;//培训结束时间
    private String datum;//培训材料
    private String teacher;//培训讲师
    private String student;//培训人员
    private Date createTime;//创建时间
    private Byte educate;//培训是否完成/1培训效果
    private String effect;
    private String summarize;//总结

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

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

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Byte getEducate() {
        return educate;
    }

    public void setEducate(Byte educate) {
        this.educate = educate;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public String getSummarize() {
        return summarize;
    }

    public void setSummarize(String summarize) {
        this.summarize = summarize;
    }

    @Override
    public String toString() {
        return "Educate{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", purpose='" + purpose + '\'' +
                ", beginTime=" + beginTime +
                ", endTime=" + endTime +
                ", datum='" + datum + '\'' +
                ", teacher='" + teacher + '\'' +
                ", student='" + student + '\'' +
                ", createTime=" + createTime +
                ", educate=" + educate +
                ", effect='" + effect + '\'' +
                ", summarize='" + summarize + '\'' +
                '}';
    }
}

