package com.javaoop.inheritance;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight(){
        //super();// even if it is not mentioned, it will be called automatically
        // i.e.the default constructor of Box class will be called automatically
        this.weight=-1;
    }
    //the "super()" keyword is for calling constructors which is matched according to default/parameterized/copy constructor
    BoxWeight(BoxWeight other){ //it invokes the copy constructor Box(Box old)
        //here other=(Box old) of the copy constructor of Box
        super(other); //here the same concept of "Box box4 =new BoxWeight(2,3,4,5);" works
        // because here, other means Box, so the object will be referenced to Box but the object is of type BoxWeight
        weight= other.weight;
    }

//    @Override //static methods can't be overridden but can be inherited
    static void greeting(){
        System.out.println("in boxweight, greetings!");
    }
    static void hello(){
        System.out.println("hey from boxweight");
    }
    BoxWeight(double side,double weight){
        super(side); //here "Box(double side)" constructor of Box class will be called
        this.weight=weight;
    }
    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w); //default constructor is automatically called if super is not declared
        this.weight = weight;
    }
}
