package com.string;

public class Comparison {
    public static void main(String[] args) {
        String a = "Ayushi";
        String b = "Ayushi";
        String c = a;
        System.out.println(c == a);
        // ==
//        System.out.println(a==b);

        String name1 = new String("Ayushi");
        String name2 = new String("Ayushi");

//        System.out.println(name1 == name2);  // comparators -> false

        System.out.println(name1.equals(name2));  // methods -> true

        System.out.println(name1.charAt(0));
    }
}
