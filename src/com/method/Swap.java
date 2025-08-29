package com.method;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // swap numbers code
//        int temp = a;
//        a = b;
//        b = temp;

        swap(a, b);

        System.out.println(a + " " + b);

        String name = "Ayushi Shaw";
        changeName(name);
        System.out.println(name);

//        System.out.println(naam);
//        int num = 40;
    }

    static void changeName(String naam){
        naam = "Rahul Rana";    // creating a new object
//        int num = 10;
//        int b = 20;
    }

    static void swap(int num1, int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
        // this change will only be valid in this function scope only.
    }
}
