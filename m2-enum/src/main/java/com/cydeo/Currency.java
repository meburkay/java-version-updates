package com.cydeo;

import java.lang.Enum;

public enum Currency{
    PENNY(1),NICKLE(5),DIME(10),QUARTER(25);//We can give enums values like this. Because we did not create them with new keyword plus constructor. They created automaticly when the enum loaded.

    private int value;

    Currency(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
