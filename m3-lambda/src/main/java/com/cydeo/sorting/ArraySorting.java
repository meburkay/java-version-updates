package com.cydeo.sorting;

public class ArraySorting { //QuickSort,BubbleSort

    public static void main(String[] args) {

        ArraySorting as = new ArraySorting();

        //We create object from QuickSort class.
        QuickSort qs = new QuickSort();
        BubbleSort bs = new BubbleSort();

        //We use the created objects to use the actions of them.
        as.sort(qs);
        as.sort(bs);

        //---------------------------------------------------------

        //With lambda we bypass the classes and only use the interface for passing the action to method.
        Sorting quickSort = () -> System.out.println("Quick Sorting");
        as.sort(quickSort);

        as.sort(() -> System.out.println("Quick Sorting"));

        //Java 8 has a lot of ready interfaces for different situations. by using them we can bypass the interface we create too. By that without creating interface, classes, objects we pass the action we want to the method.





    }

    private void sort(Sorting sorting){
        sorting.sort();
    }
}
