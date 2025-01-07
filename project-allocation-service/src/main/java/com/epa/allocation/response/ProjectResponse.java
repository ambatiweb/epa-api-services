package com.epa.allocation.response;

import java.util.Date;

public class ProjectResponse {

    private String id;

    private String accountName;

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

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
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
