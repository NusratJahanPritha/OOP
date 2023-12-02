package com.javaoop.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes sh=new Shapes();
        Circle c=new Circle();
        Square sq=new Square();

        Shapes sh2=new Square();// here, object will work according to the type of the object i.e. "Square" here,
        // not the reference i.e. "Shapes" here
        //cz the method area in the reference class Shapes is overridden in the type class Square
        //it is called Upcasting also i.e. which method will be called depends on the type of the object which is mentioned after "new" keyword
        // so we can say that the reference class says which things to access and the class which means the object type says which things to run
        //i.e. the method must be in parent class(reference class Shapes here) so that the object can get access to that method
        //but which version of that method will run is determined by the object class type(child class Square here)
        //in runtime, java will determine which method to run, it is called dynamic method dispatch/runtime polymorphism
        //


        sh.area();
        c.area();
        sq.area();

        sh2.area();

    }
}
