package com.javaoop.abstractdemo;

public class Daughter extends Parent{
    public Daughter(int age) {
        super(age);
    }
    @Override
    void career() {
        System.out.println("engineer");

    }

    @Override
    void partner() {
        System.out.println("I like jiyon");

    }
}
