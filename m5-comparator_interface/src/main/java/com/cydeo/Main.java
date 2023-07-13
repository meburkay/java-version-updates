package com.cydeo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,0,15,5,20);
        System.out.println(list);


        //Ascending
        Collections.sort(list);
        System.out.println(list);

        //Here we use the overload of sort method and it accepts Comparator interface as the second parameter. At first we use the old way and create our interface which implements Comparator interface and give it as argument. And as the second example we use lambda directly and do the implementation right here. Thus we did not use our interface or any other thing.
        //Descending
        Collections.sort(list,new MyComparator());
        System.out.println(list);

        Collections.sort(list,((o1,o2) -> (o1>o2) ? -1 : (o1<o2) ? 1 : 0));

        //Here we use directly list and as parameter we use lambda but as implementations we use ready method of Integer.
        //Ascending order
        list.sort((o1, o2) -> o1.compareTo(o2));
        System.out.println(list);

        //Descending order
        list.sort((o2, o1) -> o1.compareTo(o2));
        System.out.println(list);

    }
}
