package com.javaoop.abstractdemo;

public class Son extends Parent{
    public Son(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("doctor");

    }

    @Override
    void partner() {
        System.out.println("I like nila");

    }
}
