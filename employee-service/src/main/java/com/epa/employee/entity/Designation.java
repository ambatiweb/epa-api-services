package com.epa.employee.entity;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Designation {
    PE("Principal Engineer"),
    STE("Staff Engineer"),
    TL("Technical Lead"),
    AR("Architect"),
    SE("Senior Engineer"),
    E("Engineer"),
    ASE("Assoc Engineer");

    private String displayName;

    Designation(String displayName){
        this.displayName = displayName;
    }

    @JsonValue
    public String getDisplayName(){
        return displayName;
    }

    public static Designation valueOfOrDefault(String myValue) {
        for(Designation type : Designation.class.getEnumConstants()) {
            if(type.toString().equals(myValue)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Designation Centre not found");
    }

    }
