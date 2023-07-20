package com.cydeo;

import com.cydeo.java9.FactoryMethodsDemo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {//Optional is a final generic class, actually. It is main purpose is to prevent null pointer exception.
    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(2,4,2,10,23);

        //empty() - isPresent()

        //We create here an Optional object that is empty.
        Optional<String> empty = Optional.empty();
//        System.out.println(empty);

        //isPresent Optional method look at the object if it is empty or not. If not it returns false.
          System.out.println(empty.isPresent());
//
        //With Optional.of() we create an object to Optional. Then we can use Optional class methods.
        System.out.println(Optional.of(number).isPresent());


        //ifPresent
        Optional<Integer> bigNumber = number.stream().filter(x -> x>100).findAny();
        bigNumber.ifPresent(System.out::println);

        //get
//        System.out.println(bigNumber.get());

        //orElse
        System.out.println(bigNumber.orElse(5));

        //This line is for module system. We create module-info files and use m8's class here. The advantage of module system is when there is an error about the other module's data to compile warn us like using our own classes. At jar system we can see that at the runtime.
        FactoryMethodsDemo f1 = new FactoryMethodsDemo();

    }
}
