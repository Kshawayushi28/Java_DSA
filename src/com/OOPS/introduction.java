package com.OOPS;

import java.util.Arrays;

public class introduction {
    public static void main(String[] args) {
        // store 5 roll nos
        int[] numbers = new int[5];

        // store 5 names
        String[] names = new String[5];

        // data of 5 students: {roll no, name, marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];

        // just declaring
//        Student ayushi;
//        ayushi = new Student();

        Student ayushi = new Student(15, "Ayushi", 88.3f);
        Student rahul = new Student();

//        ayushi.rno = 13;
//        ayushi.name = "Ayushi Shaw";
//        ayushi.marks = 88.5f;

//        ayushi.changeName("Shoe lover");
//        ayushi.greeting();

//        System.out.println(Arrays.toString(students));

        System.out.println(ayushi.rno);
        System.out.println(ayushi.name);
        System.out.println(ayushi.marks);

        Student random =  new Student(ayushi);
        System.out.println(random.name);

        Student random2 =  new Student();
        System.out.println(random2.name);

        Student one = new Student();
        Student two = one;

        one.name = "Something something";

        System.out.println(two.name);
    }
}

// create a class
// for every single student
class Student {
    int rno;
    String name;
    float marks = 90;

    // we need a way to add the values of the above
    // properties object by object

    // we need one word to access every object

    void greeting() {
        System.out.println("Hello! My name is " + this.name);
    }

    void changeName(String name){
        this.name = name;
    }

    Student (Student other) {
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }

    // constructor
//    Student(){
//        this.rno = 13;
//        this.name = "Ayushi Shaw";
//        this.marks = 88.4f;
//    }

    Student(){
        // this is how you call a constructor from another constructor
        // internally : new Student();
        this (13, "default person", 100.0f);
    }

    // Student ayush = new Student(17, "Ayush", 89.3f);
    // here, this will be replaced with ayush
    Student (int roll, String name, float marks){
        this.rno = roll;
        this.name = name;
        this.marks = marks;
    }
}
