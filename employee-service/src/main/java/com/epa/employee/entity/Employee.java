package com.epa.employee.entity;


import com.epa.employee.util.EmployeeIdGenerator;
import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import java.util.Date;

@Entity
public class Employee {

    @Id
    @GeneratedValue(generator = EmployeeIdGenerator.GENERATOR_NAME)
    @GenericGenerator(
            name = EmployeeIdGenerator.GENERATOR_NAME,
            strategy = "com.epa.employee.util.EmployeeIdGenerator")
    private String id;

    private String name;
    @Enumerated(EnumType.STRING)
    private CapabilityCentre capabilityCentre;

    private Date date_of_Joining;

    @Enumerated(EnumType.STRING)
    private Designation designation;

    @Column(name = "primary_skill")
    private String primarySkill;

    @Column(name = "secondary_skill")
    private String secondarySkill;
    @Column(name = "overall_experience")
    private Integer overallExperience;

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

    public CapabilityCentre getCapabilityCentre() {
        return capabilityCentre;
    }

    public void setCapabilityCentre(CapabilityCentre capabilityCentre) {
        this.capabilityCentre = capabilityCentre;
    }

    public Date getDate_of_Joining() {
        return date_of_Joining;
    }

    public void setDate_of_Joining(Date date_of_Joining) {
        this.date_of_Joining = date_of_Joining;
    }

    public Designation getDesignation() {
        return designation;
    }

    public void setDesignation(Designation designation) {
        this.designation = designation;
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

    public Integer getOverallExperience() {
        return overallExperience;
    }

    public void setOverallExperience(Integer overallExperience) {
        this.overallExperience = overallExperience;
    }
}
