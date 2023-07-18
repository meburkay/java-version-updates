package com.cydeo.review;

@FunctionalInterface//We are using it to warn our self or the other programmers that this interface is functional. By putting this here if anybody forget and try to implement any other abstract method here compiler automatically worn us or the other programmers.
public interface CarPredicate {

    boolean test(Car car);

}
