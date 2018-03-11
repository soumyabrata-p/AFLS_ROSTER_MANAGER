package com.accenture.afls.data.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;

@XmlRootElement
@Document
public class ResourceDetails implements Serializable {


    private static final long serialVersionUID = -8353648095026268920L;

    @Id
    private String enterpriseId;
    private String name;
    private String team;
    private String role;
    private String designation;
    private String supervisor;
    private String primarySkill;
    private String secondarySkill;
    private Date rollOffDate;
    private Integer careerLevel;
    private Date lastPromoted;

    public String getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public String getPrimarySkill() {
        return primarySkill;
    }

    public void setPrimarySkill(String primarySkill) {
        this.primarySkill = primarySkill;
    }

    public String getSecondarySkill() {
        return secondarySkill;
    }

    public void setSecondarySkill(String secondarySkill) {
        this.secondarySkill = secondarySkill;
    }

    public Date getRollOffDate() {
        return rollOffDate;
    }

    public void setRollOffDate(Date rollOffDate) {
        this.rollOffDate = rollOffDate;
    }

    public Integer getCareerLevel() {
        return careerLevel;
    }

    public void setCareerLevel(Integer careerLevel) {
        this.careerLevel = careerLevel;
    }

    public Date getLastPromoted() {
        return lastPromoted;
    }

    public void setLastPromoted(Date lastPromoted) {
        this.lastPromoted = lastPromoted;
    }
}
