package com.xsy.hr.bean;

import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.sql.Date;

/**
 * @author Xsy
 * @create 2020 - 06 - 28 - 15:52
 * @version:1.0
 **/

@TableName("job")
public class Job implements Serializable {
    private static final long serialVersionUID = 8131396098557553356L;
    private Long id;//应聘人员编号
    private String name;//应聘人员姓名
    private Byte sex;//性别
    private Integer age;//年龄
    private String job;//职位
    private String specialty;//所学专业
    private String experience;//工作经验
    private String studyEffort;//学历
    private String school;//毕业学校
    private String tel;//电话号码
    private String email;//Email地址
    private Date createTime;//创建时间
    private String content;//详细经历
    private Byte isStock;//是否入库

    @Override
    public String toString() {
        return "Job{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", job='" + job + '\'' +
                ", specialty='" + specialty + '\'' +
                ", experience='" + experience + '\'' +
                ", studyEffort='" + studyEffort + '\'' +
                ", school='" + school + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                ", createTime=" + createTime +
                ", content='" + content + '\'' +
                ", isStock=" + isStock +
                '}';
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

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getStudyEffort() {
        return studyEffort;
    }

    public void setStudyEffort(String studyEffort) {
        this.studyEffort = studyEffort;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Byte getIsStock() {
        return isStock;
    }

    public void setIsStock(Byte isStock) {
        this.isStock = isStock;
    }
}
