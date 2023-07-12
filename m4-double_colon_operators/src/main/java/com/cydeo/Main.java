package com.cydeo;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        Calculate sum = (x,y) -> System.out.println(x+y);

        //If we have a method that have the same signature as the functional interface's abstract method. We can use that method as the body/implementation of the lambda expression.
        Calculate s1 = (x,y) -> Calculator.findSum(x,y);

        //If we reference another method to our lambda expression's implementation. We can use double colon operator and when we are using double colon operator we do not need to write parameters. Because the compiler already understands it from the functional interface or the method that referenced.

        //Reference to a Static Method
        Calculate s2 = Calculator::findSum;
        s2.calculate(10,20);

        //Reference to a instance method
        Calculator obj = new Calculator();
        Calculate s3 = obj ::findMultiply;

        Calculate s4 = new Calculator() ::findMultiply;


        BiFunction<String,Integer,String> func = (str, i) -> str.substring(i);
        //Here we can call String class normal method directly because of the String parameter that the func2 have. I explain it below in detail.
        BiFunction<String,Integer,String> func2 = String::substring;

        Function<Integer,Double> b = new MyClass()::method;
        //If our functional interface have the class as a parameter, we do not need to create an object from that class. We can call it like static which is showed below.
        BiFunction<MyClass,Integer,Double> b1 = MyClass::method;


        Consumer<Integer> display = i -> System.out.println(i);
        Consumer<Integer> display2 = System.out::println;






    }
}

//At lambda expressions you do the implementation. Because of that you have to use the parameter. But when you are using method reference the implementation is ready inside that method. And because you define the interface as the type at the start of the line as the variable type you do not need to write it the second time.