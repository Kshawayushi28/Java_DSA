package com.method;

import java.lang.reflect.Array;
import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
//        fun();
//        multiple(2,3,"Ayushi", "Rahul", "Momo", "Frooti");
//        demo(2,3,4);
        demo("Ayushi","Rahul");
    }


    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String ...v){

    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}
