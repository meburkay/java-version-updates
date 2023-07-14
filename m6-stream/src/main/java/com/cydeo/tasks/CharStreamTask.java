package com.cydeo.tasks;

import java.util.Arrays;
import java.util.List;

public class CharStreamTask {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("JAVA","APPLE","HONDA","DEVELOPER");

        words.stream()
                .forEach(i-> System.out.println(i.length()));

        words.stream()
                .map(String::length)//instead of str -> str.length() lambda we use method reference
                .forEach(System.out::println);


        //This is iterable's forEach method.
        words.forEach(i-> System.out.println(i.length()));


    }
}

/*
print the number of chars that given at the words List.
 */
