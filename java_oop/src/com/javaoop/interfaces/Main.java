package com.javaoop.interfaces;

public class Main {
    public static void main(String[] args) {
        Engine e=new Car();
        //e.a;//error because the object is of type Car and it decides which methods to run,
        // accessibility is decided by the reference type i.e. Engine here

        Car car=new Car();
        car.start();
        car.stop();
        car.acc();

        Media carMedia=new Car();
        carMedia.stop();//stop() from Car class is run

        Nicecar n=new Nicecar();
        n.start();
        n.startmusic();
        n.upgradeEngine();
        n.start();


    }
}
