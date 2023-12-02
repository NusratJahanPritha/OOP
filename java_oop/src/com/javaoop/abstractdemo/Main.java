package com.javaoop.abstractdemo;

public class Main {
    public static void main(String[] args) {
        Son son =new Son(40);
        son.career();

        Daughter d=new Daughter(23);
        d.career();

        son.normal();

        Parent p=new Daughter(33);
        p.career();

        Parent.hello();

        //Parent p=new Parent() //error, object of abstract class cant be created


    }
}
