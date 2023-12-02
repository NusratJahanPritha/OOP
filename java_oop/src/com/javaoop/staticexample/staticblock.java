package com.javaoop.staticexample;

public class staticblock {
    static int a=6;
    static int b;
    //static block runs only once when the 1st object is created i.e. the class is loaded for the first time
    static {//static block
        System.out.println("In static block");
        b=a*10;
    }

    public static void main(String[] args) {
        staticblock obj=new staticblock();
        System.out.println(staticblock.a+" "+staticblock.b);

        staticblock.b+=3;
        System.out.println(staticblock.a+" "+staticblock.b);

        staticblock obj2=new staticblock(); //this time while creating 2nd object, the static block will not run
        System.out.println(staticblock.a+" "+staticblock.b);
    }
}
