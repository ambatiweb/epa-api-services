package com.epa.allocation.response;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.util.Date;

public class EmployeeResponse {

    private String id;

    private String name;

    private String capabilityCentre;

    private Date date_of_Joining;

    private String designation;

    private String primary_skill;

    private String secondary_skill;

    private Integer overall_experience;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapabilityCentre() {
        return capabilityCentre;
    }

    public void setCapabilityCentre(String capabilityCentre) {
        this.capabilityCentre = capabilityCentre;
    }

    public Date getDate_of_Joining() {
        return date_of_Joining;
    }

    public void setDate_of_Joining(Date date_of_Joining) {
        this.date_of_Joining = date_of_Joining;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getPrimary_skill() {
        return primary_skill;
    }

    public void setPrimary_skill(String primary_skill) {
        this.primary_skill = primary_skill;
    }

    public String getSecondary_skill() {
        return secondary_skill;
    }

    public void setSecondary_skill(String secondary_skill) {
        this.secondary_skill = secondary_skill;
    }

    public Integer getOverall_experience() {
        return overall_experience;
    }

    public void setOverall_experience(Integer overall_experience) {
        this.overall_experience = overall_experience;
    }
}
