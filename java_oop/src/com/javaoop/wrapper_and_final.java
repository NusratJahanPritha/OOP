package com.javaoop;

public class wrapper_and_final {
    public static void main(String[] args){
        int a=10;
        Integer num=45;
        //here integer is a class which is wrapper class, num is an object and it has several builtin properties
        // Integer class is a final class so its value cant be changed
//there are many properties of num like the followings:
//        num.byteValue();
//        num.hashCode();


        final A nusrat=new A("nusrat jahan");
        nusrat.name="other name";

        //when a non primitive like nusrat here is final, the value can be changed like above
        // but the it can not be reassigned as a new object like below
//        nusrat=new A("new object")// cant do this

//        A obj;
//        for(int i=0; i<10000000; i++){
//            obj= new A("r");
//        }
        A obj=new A("random");
        System.out.println(obj);

    }



}
class A{
    final int num=10;
    String name;

    public A(String name){
        this.name=name;
    }
    //when an object is removed from heap or destroyed, then it is not done manually,
    //java decides the destroy using garbage collector
    //but we can define some things manually and tell java to do these things while destroying

    @Override
    protected void finalize() throws Throwable {
        System.out.println("object is destroyed");
    }
}