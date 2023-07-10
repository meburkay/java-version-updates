package com.cydeo.review;

import java.util.List;

public class MyUtils<T> {

    //if we use class level generic, we can not implement it to static methods. Because it will change according to the object creating and static methods belongs to the class and does not change according to the object creating.
    public void printInfo2(List<T> list) {
        for (T item : list) {
            System.out.println(item);
        }
        System.out.println(list.size());
    }

    public T getLastItem(List<T> list) {
        return list.get(list.size() - 1);
    }

}
