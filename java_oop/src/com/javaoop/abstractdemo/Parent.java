package com.javaoop.abstractdemo;

public abstract class Parent {//abstract class can't be final cz it must be overridden
    // static and non-static variables and methods can be in abstract class
    // final and non-final variables can be in abstract class
    int age;
    final int value;
    public Parent(int age) {
        this.age = age;
        value=2344;
    }
    static void hello(){ //abstract class can have static method
        System.out.println("hi");
    }
    void normal(){
        System.out.println("normal method");
    }
    abstract void career();//at least one method should be abstract in abstract class
    abstract void partner();
}
