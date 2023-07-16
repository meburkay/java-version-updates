package com.cydeo;

import com.cydeo.tasks.dishTask.Dish;
import com.cydeo.tasks.dishTask.DishData;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(4,5,3,9);

        /*int sum = 0;
        for(int number : numbers){
            sum = sum + number;
        }*/

        int result = numbers.stream().reduce(0,(a,b) -> a+b);

        //If we did not use identity value the return become Optional because of the null safety.
        Optional<Integer> result2 = numbers.stream().reduce((a,b) -> a+b);

        //when we use .get() at the end Optional change to normal int.
        int result3 = numbers.stream().reduce((a,b) -> a+b).get();
        System.out.println(result);


        System.out.println("Dish Calories Total");
        int totalCalories = DishData.getAll().stream()
                .map(Dish::getCalories)
                //.reduce((a,b)-> a+b) //Instead of this in Integer class we have ready methods like below. Because of that instead of lambda we use method reference.
                .reduce(Integer::sum)
                .get();

        System.out.println(totalCalories);


        //Max and Min
        Optional<Integer> min = numbers.stream().reduce(Integer::min);
        Optional<Integer> max = numbers.stream().reduce(Integer::max);
        Optional<Integer> sum = numbers.stream().reduce(Integer::sum);

        System.out.println("Min:" + min.get());
        System.out.println("Max:" + max.get());
        System.out.println("Sum:" + sum.get());

        System.out.println("COUNT");
        long dishCount = DishData.getAll().stream().count();
        System.out.println(dishCount);
    }
}
