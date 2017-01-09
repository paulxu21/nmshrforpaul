package com.xhp.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by xuhaipeng on 2017/1/9.
 *
 */
@Entity
public class Employee {
    //属性
    @Id
    @GeneratedValue
    private Integer emId;
    private String emNo;
    private String emName;
    private Integer emGrade;
    private Date emLastDateOfGrade;
    @ManyToOne
    private Section emSection;

    //属性getter、setter

    public Integer getEmId() {
        return emId;
    }

    public void setEmId(Integer emId) {
        this.emId = emId;
    }

    public String getEmNo() {
        return emNo;
    }

    public void setEmNo(String emNo) {
        this.emNo = emNo;
    }

    public String getEmName() {
        return emName;
    }

    public void setEmName(String emName) {
        this.emName = emName;
    }

    public Integer getEmGrade() {
        return emGrade;
    }

    public void setEmGrade(Integer emGrade) {
        this.emGrade = emGrade;
    }

    public Date getEmLastDateOfGrade() {
        return emLastDateOfGrade;
    }

    public void setEmLastDateOfGrade(Date emLastDateOfGrade) {
        this.emLastDateOfGrade = emLastDateOfGrade;
    }

    public Section getEmSection() {
        return emSection;
    }

    public void setEmSection(Section emSection) {
        this.emSection = emSection;
    }

    //构造器

    public Employee() {
        super();
    }

    public Employee(String emNo, String emName, Integer emGrade, Date emLastDateOfGrade, Section emSection) {
        //super();
        this.emNo = emNo;
        this.emName = emName;
        this.emGrade = emGrade;
        this.emLastDateOfGrade = emLastDateOfGrade;
        this.emSection = emSection;
    }
}
