package com.cydeo;

public enum Operation {
    PLUS,MINUS,MULTIPLY,DIVIDE; //each constant is object(new) of Operation. Because of that when Operation enum class loaded the constractor work 4 times.

    private Operation() {//Here says that private access modifier is redundent. Because at enums constructors are implicitly private. It is not necessary to specify it like this. Instead we must write directly Operation().

        System.out.println("Constructor");
    }
}
