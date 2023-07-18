package com.cydeo.review;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class CarTest {

    public static void main(String[] args) {

        List<Car> carList = new ArrayList<>();

        carList.add(new Car("Toyota", 140, 1998));
        carList.add(new Car("Audi", 200, 2008));
        carList.add(new Car("BMW", 210, 2020));
        carList.add(new Car("Nissan", 150, 2018));

//        System.out.println(filterFastCars(carList));
//        System.out.println(filterNewCars(carList));

//        System.out.println("Fast Cars:");
//        System.out.println(filter(carList, new CarFastPredicate()));
//
//        System.out.println("New Cars:");
//        System.out.println(filter(carList, new CarNewPredicate()));

        // Fat Arrow
        // ->

        //We can use lambda by assigning it to a functional interface variable or directly using as an argument which is functional interface parameter.
        //We can not use lambda variables in another class.
        CarPredicate fastCarPredicate = car -> car.getTopSpeed() > 160;
        System.out.println("Fast Cars:");
        System.out.println(filter(carList, fastCarPredicate));

        Predicate<Car> fastCarPredicateWithReadyFunctionalInterface = car -> car.getTopSpeed() > 160;

        System.out.println("New Cars:");
        System.out.println(filter(carList, car -> car.getYear() > 2015));
    }

    //region Without Behaviour Parameterization
    //We create the filter methods without behaviour parameterization. In the methods only change the for loops interior/the conditions changes. The other codes repeated. And if you think we will do it for so many parameters, we have to create a lot of methods with almost the same code.
    private static List<Car> filterFastCars(List<Car> cars) {

        List<Car> filteredCars = new ArrayList<>();

        for (Car car : cars) {
            if (car.getTopSpeed() > 160) {
                filteredCars.add(car);
            }
        }

        return filteredCars;

    }


    private static List<Car> filterNewCars(List<Car> cars) {

        List<Car> filteredCars = new ArrayList<>();

        for (Car car : cars) {
            if (car.getYear() > 2015) {
                filteredCars.add(car);
            }
        }

        return filteredCars;

    }


    //endregion

    //With behaviour parameterization

    //We create one method and only change the if condition in the for loop. We change it by sending the CarPredicate as a second parameter. According to our parameter the method change its behaviour.
    private static List<Car> filter(List<Car> cars, CarPredicate carPredicate) {

        List<Car> filteredCars = new ArrayList<>();

        for (Car car : cars) {
            if (carPredicate.test(car)) {//here we use behaviour parameterization.
                filteredCars.add(car);
            }
        }

        return filteredCars;

    }

    //With ready Functional Interface
    private static List<Car> filterReadyFunctionalInterface(List<Car> cars, Predicate<Car> predicate) {

        List<Car> filteredCars = new ArrayList<>();

        for (Car car : cars) {
            if (predicate.test(car)) {
                filteredCars.add(car);
            }
        }

        return filteredCars;

    }

}
