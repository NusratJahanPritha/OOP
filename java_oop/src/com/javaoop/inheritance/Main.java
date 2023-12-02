package com.javaoop.inheritance;

public class Main {
    public static void main(String[] args) {
        Box box=new Box(4.6,2.3,1.2);
        Box box2=new Box(box);
        //System.out.println(box.l+" "+box.h+" "+box.w);//can't access l because its private
        System.out.println(box.h+" "+box.w);
        System.out.println(box2.h+" "+box2.w);

        BoxWeight box3=new BoxWeight();
        System.out.println(box3.h+" "+box3.weight);

        //only lower classes(childs) can access upper classes(parents) but upper classes have no idea of the members of the lower classes

        Box box4 =new BoxWeight(2,3,4,5);
        //here box4 object is referencing to Box class but it is type of BoxWeight class

        //System.out.println(box4.weight);//can't access weight because access of the object is permitted only to the reference class i.e.Box here
        // so even though the object box4 is of type BoxWeight, it can't access BoxWeight's members
        // cz box4's reference class is Box, so box4 can access Box's members only who are not private

        //System.out.println(box4.l);//can't access l because l is private

        System.out.println(box4.w);

        //BoxWeight box5 =new Box(2,3,4,8)//here as the object box5 is referencing to Boxweight class
        //so box5 should have access to BoxWeight's members and for accessing, it should have to initialize it
        // but it is type of parent class Box and Box class has no idea of weight as its upper class than BoxWeight
        //so the weight can't be initialized here as weight=8, if weight is initialized here, then error occurs


        BoxPrice box6=new BoxPrice(5,4,2);
        //"BoxWeight(double side,double weight)" constructor from BoxWeight will be called


       Box.greeting();

       Box box7=new BoxWeight();
       box7.hello();//here the hello() method from BoxWeight class will be called because of runtime polymorphism,
        // it decides which method to run in runtime
        // and the method from the class of object type will be run i.e. child class boxWeight here
       box7.greeting(); //here the greeting() method from Box class will be called, not from BoxWeight class because static method does not depend on object

        BoxWeight box8=new BoxWeight();
        box8.greeting(); //if there is no method in BoxWeight named greeting(), then it would be inherited from the parent class

        BoxPrice box9= new BoxPrice();
        box9.greeting();// there is no method in BoxPrice named greeting(), then it is inherited from the parent class BoxWeight
 //overriding depends on object but static does not depend on object, so static method cant be overridden
    }
}
