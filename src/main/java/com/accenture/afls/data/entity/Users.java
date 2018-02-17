package com.accenture.afls.data.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Document
public class Users {
    @Id
    private String enterpriseId;
    private String password;
    private String designation;
    private String userRole;

    public Users(){}

    public Users(String enterpriseId,String password,String designation,String userRole) {
        this.enterpriseId = enterpriseId;
        this.password = password;
        this.designation = designation;
        this.userRole = userRole;
    }
    public String getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }
}
