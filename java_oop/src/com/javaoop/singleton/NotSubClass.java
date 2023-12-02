package com.javaoop.singleton;

import com.javaoop.access.A;

public class NotSubClass {


    public static void main(String[] args) {
        NotSubClass obj=new NotSubClass();
        //int n=obj.num;//// protected member can't be accessible in non-subclass of different package
    }
}
