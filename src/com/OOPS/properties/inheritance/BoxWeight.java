package com.OOPS.properties.inheritance;

import java.util.ArrayList;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight() {
        this.weight = -1;
    }

//    @Override
    static void greeting(){
        System.out.println("Hey, I am in BoxWeight class. Greetings!");
        ArrayList list = new ArrayList();
    }

    BoxWeight(BoxWeight other) {
        super(other);
        weight = other.weight;
    }

    BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
    }

    public BoxWeight(double l, double h, double w, double weight) {

        super(l, h, w);   // what is this?    call the parent class constructor
        // use to initialize values present in parent class

//        System.out.println(super.weight);

        this.weight = weight;
    }
}
