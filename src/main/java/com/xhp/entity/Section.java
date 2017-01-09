package com.xhp.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * Created by xuhaipeng on 2017/1/9.
 */
@Entity
public class Section {
    //属性
    @Id
    @GeneratedValue
    private Integer secId;
    private String secName;
    @OneToOne
    @JsonIgnore
    private Employee secManager;

    //属性getter、setter

    public Integer getSecId() {
        return secId;
    }

    public void setSecId(Integer secId) {
        this.secId = secId;
    }

    public String getSecName() {
        return secName;
    }

    public void setSecName(String secName) {
        this.secName = secName;
    }

    public Employee getSecManager() {
        return secManager;
    }

    public void setSecManager(Employee secManager) {
        this.secManager = secManager;
    }

    //构造器

    public Section() {
        super();
    }

    public Section(String secName, Employee secManager) {
        this.secName = secName;
        this.secManager = secManager;
    }
}
