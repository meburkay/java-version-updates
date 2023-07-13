package com.cydeo.apple;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;


public class AppleTest {

    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<Apple>();
        inventory.add(new Apple(300,Color.GREEN));
        inventory.add(new Apple(100,Color.RED));
        inventory.add(new Apple(200,Color.GREEN));
        inventory.add(new Apple(50,Color.RED));

        //comparing returns a Comparator. It accepts function as argument. We put function as lambda here. The lambda parameter have to be the same as the Comparator generic. And as the implementations we define how we will compare this item. Here it is apple. And as the result of implementation is the weight of the apple. Thus we say that look at the apples weight and compare them.
        Comparator<Apple> sortApple = comparing((Apple apple) -> apple.getWeight());
        //We give the comparator that we created above to sort method. And it sorts the apples according to the comparator we give.
        inventory.sort(sortApple);
        System.out.println(inventory);


        //Here instead of lambda we give method reference with double colon operator.
        inventory.sort(comparing(Apple::getWeight));
        System.out.println(inventory);

        //Reversed
        inventory.sort(comparing(Apple::getWeight).reversed());
        System.out.println(inventory);

        //Chaining
        inventory
                .sort(comparing(Apple::getWeight)
                .reversed().thenComparing(Apple::getColor));




    }
}
