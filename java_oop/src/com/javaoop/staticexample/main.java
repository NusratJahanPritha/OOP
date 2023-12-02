package com.javaoop.staticexample;

public class main {
    public static void main(String[] args) {
        Human nusrat=new Human(12,"njahan",10000,false);
        Human pima=new Human(13,"pima", 2000,true);
        Human pia=new Human(14,"pia", 20400,true);

        System.out.println(Human.population);

        main f=new main();
        f.fun2();
        f.fun();

        //greeting();//cant do that because greeting is not static so it cant be used inside static method

    }
    static void fun(){
        //greeting();//cant do that because greeting is not static so it cant be used inside static method
        //the greeting method requires object to be used
        //cant access non static without creating its object in a static context,
        //so here I am creating object of main and then using non static method greeting()
        main obj=new main();
        obj.greeting();
    }
    //as greeting() is not static, it belongs to an object,
    // so we can only use it when we know which object it belongs to



    void fun2(){
        greeting();//non static inside non static, so no problem because object for using fun2() will be created in main
    }

    void greeting(){
//        fun(); // we can use  a static thing inside a non static thing
        System.out.println("hii");
    }

}
