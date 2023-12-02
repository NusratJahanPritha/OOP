package com.javaoop.staticexample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;//it can be accessed before any object of the class is created
    //static variables can be accessed/used without creating any object
    //static things are belonged to the class
    //inside a static method, any non static method can not be used
    //static method only access static data,
    // cant access non static data because non static data belongs to an object
    static void message(){
        System.out.println("hello world");
        //System.out.println(this.age);//cant use 'this' keyword in static context, cz 'this' indicated an object
    }

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population+=1;
        Human.message();

    }
}
