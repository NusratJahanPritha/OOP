package com.javaoop.polymorphism;

import java.awt.*;
//every parent class is inherited from an "Object" class which is built in in java
public class Shapes {
    void area(){
        System.out.println("shape");
    }


    //final void area(){  //early binding which is decided in compile time,
    //final keyword is also used for preventing the class from being inherited
    //if a class is declared as final, the class's methods will also be final
//        System.out.println("shape");
//    }
}
    //Overriding is late binding which is decided in runtime