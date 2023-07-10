package com.cydeo.review;

public enum Role {

    ADMIN("Admin"), MANAGER("Manager"), EMPLOYEE("Employee"); //  new Role("Employee");

    public String value;

    Role(String value) {
        this.value = value;
    }

}
