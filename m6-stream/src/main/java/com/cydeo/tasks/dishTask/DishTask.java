package com.cydeo.tasks.dishTask;

import java.util.Comparator;
import java.util.List;

public class DishTask {

    public static void main(String[] args) {

        List<Dish> dishList = DishData.getAll();

        //Print all dishes name that has less than 400 calories.
        dishList.stream()
                .filter(i -> i.getCalories()<400)
                //.map(dish -> dish.getName())
                .map(Dish::getName)
                .forEach(System.out::println);



        //Print the length of the name of each dish
        dishList.stream()
                .forEach(i -> System.out.println(i.getName().length()));

        DishData.getAll().stream()
                .map(Dish::getName)
//                .map(dish -> dish.length())
                .map(String::length)
                .forEach(System.out::println);



        //Print three high caloric dish name ( >300)
        dishList.stream()
                .filter(i -> i.getCalories()>300)
                .map(Dish::getName)
                .limit(3)
                .forEach(System.out::println);


        //Print all dish name that are below 400 hundred calories in sorted
        dishList.stream()
                .filter(i -> i.getCalories()<400)
                //.sorted(Comparator.comparing(dish -> dish.getCalories()))
                //.sorted((o1,o2) -> ((Integer)o1.getCalories()).compareTo(((Integer)o2.getCalories())))
                .sorted(Comparator.comparing(Dish::getCalories))
                .map(Dish::getName)
                .forEach(System.out::println);



    }
}
