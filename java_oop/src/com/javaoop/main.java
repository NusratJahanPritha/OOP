package com.javaoop;

public class main {
    public static void main(String args[]){
//        System.out.println("java");
        Student pritha=new Student();
        Student nusrat=new Student(12,"nusrat jahan",90.0f);
        Student nila =new Student();
        Student nil=new Student(nusrat);

        System.out.println(pritha.rno);
        System.out.println(pritha.name);
        System.out.println(pritha.marks);

        System.out.println(nusrat.rno);
        System.out.println(nusrat.name);
        System.out.println(nusrat.marks);

        System.out.println(nila.rno);
        System.out.println(nila.name);
        System.out.println(nila.marks);

        System.out.println(nil.rno);
        System.out.println(nil.name);
        System.out.println(nil.marks);

        nila.greet();
        nil.changename();
        pritha.changename("pima");
        pritha.greet();



    }
}

class Student{
    int rno;
    String name;
    float marks;

    Student(){
        this.rno=14;
        this.name="default";
        this.marks=34.0f;
    }
    //    Or,
    //    Student(){
//        this(14,"default",34.0f);
//    }
    Student(int roll,String name, float marks){
        this.rno=roll;
        this.name=name;
        this.marks=marks;
    }
    Student(Student other){
        this.rno= other.rno;
        this.name=other.name;
        this.marks=other.marks;
    }

    void greet(){
        System.out.println("hello "+name);
    }
    void changename(){
        this.name="nita";
        System.out.println("hi "+name);
    }

    void changename(String name){
        this.name=name;
    }


}
