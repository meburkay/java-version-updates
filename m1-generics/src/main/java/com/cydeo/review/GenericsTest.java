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

        System.out.println(getLastItem(studentList));
        System.out.println(getLastItem(teacherList));

    }

    // Write a method that takes a list of students, prints each student and the total student count
    public static void printInfo(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println(students.size());
    }

    public static <T> void printInfo2(List<T> personList) {
        for (T person : personList) {
            System.out.println(person);
        }
        System.out.println(personList.size());
    }

    public static <T> T getLastItem(List<T> list) {
        return list.get(list.size() - 1);
    }

}
