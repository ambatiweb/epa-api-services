package com.epa.employee.entity;

import com.fasterxml.jackson.annotation.JsonValue;

public enum CapabilityCentre {
    A("Product and Platform"),
    B("DEP-Cloud"),
    C("DEVAA"),
    D("DEP-Quality");

    private String displayName;

    CapabilityCentre(String displayName){
        this.displayName = displayName;
    }
    @JsonValue
    public String getDisplayName(){return displayName;}

    @Override
    public String toString() {
        return super.toString();
    }

    public static CapabilityCentre valueOfOrDefault(String myValue) {
        for(CapabilityCentre type : CapabilityCentre.class.getEnumConstants()) {
            if(type.toString().equals(myValue)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Capability Centre not found");
    }
}
