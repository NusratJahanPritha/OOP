package com.javaoop.staticexample;

//the 1st class i.e. the outside class like the class Innerclasses here cant be static cz it is not dependent on any other class
//static public class Innerclasses--it cant be done
//only inner classes i.e. classes under the beginner class can be static which is class A here

public class innerexample2 {
//static things work in compile time as they have no need with objects
    static class B{
         String name;

        public B(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        B obj1=new B("nila");
        B obj2=new B("anil");

        System.out.println(obj1.name);
        System.out.println(obj2.name);
    }
}

