package com.cydeo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //ArrayList only accepts objects belongs to Integer class.We provide this by generics. If we do not use it and directly use ArrayList it accept all object types
        ArrayList<Integer> items = new ArrayList<Integer>();

        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
//        items.add("Apple"); //We can not add because of <Integer> generic.



        printDoubled(items);


        System.out.println("***********************");

        FootballPlayer joe = new FootballPlayer("joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<SoccerPlayer> liverpool = new Team("Liverpool"); //Team accepting any object


//        liverpool.addPlayer(joe);
//        liverpool.addPlayer(pat);
          liverpool.addPlayer(beckham);














    }

    private static void printDoubled(ArrayList<Integer> items) {
        for(Integer i : items){
            System.out.println(i*2);
        }
    }
}
