package com.OOPS.cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human ayushi = new Human(34, "Ayushi Shaw");
//        Human twin = new Human(ayushi);

        Human twin = (Human)ayushi.clone();
        System.out.println(twin.age + " " + twin.name);
        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0] = 100;

        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(ayushi.arr));

    }
}
