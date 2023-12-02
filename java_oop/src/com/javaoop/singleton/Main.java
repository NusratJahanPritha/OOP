package com.javaoop.singleton;

import com.javaoop.access.A;

public class Main {
    public static void main(String[] args) {
        singleton obj=singleton.getInstance();
        singleton obj2=singleton.getInstance();
        singleton obj3=singleton.getInstance();
        
        System.out.println(obj);
        System.out.println(obj2);
        System.out.println(obj3);

        A a2=new A(12,"nila");
        //int o=a2.num2; //default access modifier which is not accessible in different package
    }
    //all these 3 objects are pointing to just one object
}
