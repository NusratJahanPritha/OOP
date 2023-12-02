package com.javaoop.inheritance;

public class Box {
    private double l;
    double h;
    double w;


    Box(){   //default constructor which is automatically called if super is not declared
        this.l=-1;
        this.h=-1;
        this.w=-1;
    }
    static void greeting(){
        System.out.println("in box, greetings!");
    }
    static void hello(){
        System.out.println("hey from box");
    }
    Box(double side) {
        this.l = side;
        this.h = side;
        this.w = side;
    }

    Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }
    //copy constructor
    Box(Box old){
        this.l=old.l;
        this.h=old.h;
        this.w=old.w;
    }
    public void info(){
        System.out.println("running the box");
    }

}
