package com.javaoop.polymorphism;

public class Square extends Shapes{
    @Override //it checks if the same named method of the parent class is overridden or not
    void area(){
        System.out.println("square");
    }
}
