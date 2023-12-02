package com.javaoop.staticexample;


class A{
    static String name;

    public A(String name) {
        A.name = name;
    }
}
public class innerexample1 {


    public static void main(String[] args) {
        A obj1=new A("nila");
        A obj2=new A("anil");

        System.out.println(obj1.name);
        System.out.println(obj2.name);
    }
}
