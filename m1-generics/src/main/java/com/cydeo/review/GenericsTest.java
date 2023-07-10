package com.cydeo.review;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Mike", 101));
        studentList.add(new Student("Joe", 102));
        studentList.add(new Student("Adam", 103));

        List<Teacher> teacherList = new ArrayList<>();

        teacherList.add(new Teacher("Albus", 201));
        teacherList.add(new Teacher("Severus", 202));

//        printInfo(studentList);
//        printInfo(teacherList);

//        printInfo2(studentList);
//        printInfo2(teacherList);

//        System.out.println(getLastItem(studentList));
//        System.out.println(getLastItem(teacherList));

        MyUtils<Student> obj1 = new MyUtils<>();
        obj1.printInfo2(studentList);
        System.out.println(obj1.getLastItem(studentList));

//        obj1.printInfo2(teacherList); // Because we created the object as Student. We have to use all the generics with this object as Student. When we use class level it give us this inflexibility. But when we use it method level. It is more flexible. And you can use it with static methods.

        MyUtils<Teacher> obj2 = new MyUtils<>();
        obj2.printInfo2(teacherList);
        System.out.println(obj2.getLastItem(teacherList));

        // MyUtils<String> obj3 = new MyUtils();  //By using inheritance at generic we restrict the T.


    }

    // Write a method that takes a list of students, prints each student and the total student count
    public static void printInfo(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println(students.size());
    }

    public static <T extends Person> void printInfo2(List<T> personList) {
        for (T person : personList) {
            System.out.println(person);
        }
        System.out.println(personList.size());
    }

    public static <T> T getLastItem(List<T> list) {
        return list.get(list.size() - 1);
    }

}
