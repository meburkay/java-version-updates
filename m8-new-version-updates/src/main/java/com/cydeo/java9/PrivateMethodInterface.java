package com.cydeo.java9;

import java.time.LocalDate;

public interface PrivateMethodInterface {

    boolean isHoliday(LocalDate date);

    default boolean isBusinessDay(LocalDate date){
        validate(date);
        return !isHoliday(date);
    }

    default LocalDate nextDay(LocalDate date){
        validate(date);
        LocalDate nextDate = date.plusDays(1);
        return isHoliday(nextDate) ? nextDay(nextDate): nextDate;
    }

    //At java 8 default methods came but when we are using default methods in java and we need to use same code blocks we have duplicate codes. Because of that at java 9 private methods came and the problem solved by that.
    private void validate(LocalDate date){
        if(date.isBefore(LocalDate.of(2001,1,1))){
            throw new IllegalArgumentException();
        }
    }
}
