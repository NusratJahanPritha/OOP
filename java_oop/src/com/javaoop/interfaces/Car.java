package com.javaoop.interfaces;

public class Car implements Engine,Brake, Media{
    int a=30;
    @Override
    public void brake() {
        System.out.println("normal brake");
    }

    @Override
    public void start() {
        System.out.println("normal start");

    }

    @Override
    public void stop() {
        System.out.println("normal stop");

    }

    @Override
    public void acc() {
        System.out.println("normal acc");

    }
}
