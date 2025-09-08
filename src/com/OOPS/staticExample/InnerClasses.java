package com.OOPS.staticExample;

import java.util.Arrays;

public class InnerClasses {
    static class Test{
        String name;
        public Test(String name){
            this.name = name;
        }

        @Override
        public String toString(){
            return name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Ayushi");
        Test b = new Test("Rahul");

//        Arrays.toString(new int[]{3, 4, 5});

        System.out.println(a);

//        System.out.println(a.name);
//        System.out.println(b.name);
    }
}

//static class A{
//
//}
