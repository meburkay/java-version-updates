package com.cydeo.tasks.stateTask;

import java.util.Arrays;
import java.util.List;

public class StateTest {

    public static void main(String[] args) {


        State va = new State();
        va.addCity("McLean");
        va.addCity("Arlington");
        va.addCity("Fairfax");
        va.addCity("FallsChurch");

        State tx= new State();
        tx.addCity("Dallas");
        tx.addCity("Plano");
        tx.addCity("Austin");
        tx.addCity("Houston");

        List<State> list = Arrays.asList(va,tx);

//        list.stream().map(state -> state.getCity()).forEach(System.out::println);

        //Good example for flatMap. When we have lists in a stream and want the member of the lists one by one we use flatMap. Here we use and get rid of List String and have a Stream String.
        list.stream()
                .map(state -> state.getCity())
                .flatMap(List::stream)
                .forEach(System.out::println);

    }
}