package com.rickyin.bigdata.java;

public class Java17_Class1 {
    public static void main(String[] args) {
        test(Person17.class);
        test(User17.class);
        //test(Student17.class);

        test1(Person17.class);
        //test1(User17.class);
        //test1(Student17.class);
    }
    public static void test(Class<? extends Person17> c){
        System.out.println(c);
    }

    public static void test1(Class<? super Person17> c){
        System.out.println(c);
    }
}
class Person17{

}
class User17 extends Person17{

}
class Student17{

}