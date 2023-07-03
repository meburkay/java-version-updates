package com.cydeo;

public enum ProjectStatus {

    OPEN,CLOSED,PROGRESS("IN PROGRESS");//If we have enums both with and without value, we must create two constructors. One is with parameter and one with default.

    String status;

    ProjectStatus(String status) {
        this.status = status;
    }

    ProjectStatus() {
    }
}
