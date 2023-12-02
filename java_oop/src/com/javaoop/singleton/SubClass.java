package com.javaoop.singleton;

import com.javaoop.access.A;

public class SubClass extends A {
    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
//        A obj=new SubClass(43,"anil");
//        int n=obj.num;//error cz A is not subclass, protected member can be accessible in subclass of different package,
//       not even the class of different package

        SubClass obj=new SubClass(43,"anil");
        int n=obj.num;// protected member can be accessible in subclass of different package
    }
}
class SubClass2 extends A {
    public SubClass2(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
//        A obj=new SubClass(43,"anil");
//        int n=obj.num;//error cz A is not subclass, protected member can be accessible in subclass of different package,
//       not even the class of different package

        SubClass2 obj=new SubClass2(43,"anil");
        int n2=obj.num;// protected member can be accessible in subclass of different package
    }
}
class SubsubClass extends SubClass {
    public SubsubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
//        A obj=new SubClass(43,"anil");
//        int n=obj.num;//error cz A is not subclass, protected member can be accessible in subclass of different package,
//       not even the class of different package

        SubsubClass obj=new SubsubClass(43,"anil");
        int n=obj.num;// protected member can be accessible in subclass of different package
    }
}
