package com.cydeo.review;

import java.util.ArrayList;
import java.util.List;

public class CarTest {

    public static void main(String[] args) {

        List<Car> carList = new ArrayList<>();

        carList.add(new Car("Toyota", 140, 1998));
        carList.add(new Car("Audi", 200, 2008));
        carList.add(new Car("BMW", 210, 2020));
        carList.add(new Car("Nissan", 150, 2018));

//        System.out.println(filterFastCars(carList));
        System.out.println(filterNewCars(carList));

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


}
