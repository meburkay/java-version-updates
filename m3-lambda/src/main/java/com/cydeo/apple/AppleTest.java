package com.cydeo.apple;

import java.util.ArrayList;
import java.util.List;

public class AppleTest {

    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple(250, Color.RED));
        inventory.add(new Apple(100, Color.GREEN));
        inventory.add(new Apple(300, Color.RED));
        inventory.add(new Apple(350, Color.GREEN));
        inventory.add(new Apple(50, Color.RED));

        List<Apple> heavyApple = filterApples(inventory, new AppleHeavyPredicate());
        System.out.println("heavyApple = " + heavyApple);

        //Lambda way.
        ApplePredicate weightApple= (Apple apple) -> apple.getWeight()>200;
        filterApples(inventory, weightApple);
        filterApples(inventory,apple -> apple.getWeight()>200);// we do it in one line. And we do not use type and pharantesis.

        List<Apple> greenApple = filterApples(inventory, new AppleGreenColorPredicate());
        System.out.println("greenApple = " + greenApple);

    }

    private static List<Apple> filterApples(List<Apple> inventory, ApplePredicate applePredicate){

        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory) {
            if(applePredicate.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }

}
