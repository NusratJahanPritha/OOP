package com.javaoop.access;

public class A {

//    private int num;
    protected int num;
    //int num2;//default access modifier which is only accessible within same package
    String name;
    int[] arr;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}
