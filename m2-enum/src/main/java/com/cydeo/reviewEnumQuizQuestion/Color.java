package com.cydeo.reviewEnumQuizQuestion;

public enum Color implements Printable {

    // Anonymous Class

    RED("RED"),
    GREEN("GREEN"),
    BLUE("BLUE");

    public String value;

    Color(String value) {
        this.value = value;
    }

    public void print() {
        System.out.println(this.value);
    }

}
