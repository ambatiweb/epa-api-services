package com.epa.project.entity;

import com.epa.project.util.ProjectIdGenerator;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.hibernate.annotations.GenericGenerator;

import java.util.Date;

@Entity
public class Project {

    @Id
    @GeneratedValue(generator = ProjectIdGenerator.GENERATOR_NAME)
    @GenericGenerator(
            name = ProjectIdGenerator.GENERATOR_NAME,
            strategy = "com.epa.project.util.ProjectIdGenerator")
    private String id;

    private AccountName accountName;

    private String project_name;

    private Float allocation;

    private Date project_start_date;

    private Date project_end_date;

    private String remarks;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AccountName getAccountName() {
        return accountName;
    }

    public void setAccountName(AccountName accountName) {
        this.accountName = accountName;
    }

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    public Float getAllocation() {
        return allocation;
    }

    public void setAllocation(Float allocation) {
        this.allocation = allocation;
    }

    public Date getProject_start_date() {
        return project_start_date;
    }

    public void setProject_start_date(Date project_start_date) {
        this.project_start_date = project_start_date;
    }

    public Date getProject_end_date() {
        return project_end_date;
    }

    public void setProject_end_date(Date project_end_date) {
        this.project_end_date = project_end_date;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
