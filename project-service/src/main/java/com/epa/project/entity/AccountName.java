package com.epa.project.entity;

import com.fasterxml.jackson.annotation.JsonValue;

public enum AccountName {
    CLIENT1("Ancestry"),
    CLIENT2("BNYM"),
    CLIENT3("Calibo LLC"),
    CLIENT4("Experian"),
    CLIENT5("Ford"),
    CLIENT6("Guaranteed Rate"),
    CLIENT7("Invoice Cloud"),
    CLIENT8("Vattikuti Ventures LLC"),
    CLIENT9("Zip Co US Inc"),
    CLIENT10("PayPal"),
    CLIENT11("Johnson Controls Inc"),
    CLIENT12("Western Union");

    private String displayName;

    AccountName(String displayName){
        this.displayName = displayName;
    }

    @JsonValue
    public String getDisplayName(){
        return displayName;
    }

    public static AccountName valueOfOrDefault(String myValue) {
        for(AccountName type : AccountName.class.getEnumConstants()) {
            if(type.toString().equals(myValue)) {
                return type;
            }
        }
        throw new IllegalArgumentException("AccountName not found");
    }

    }
