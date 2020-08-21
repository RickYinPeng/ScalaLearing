package com.rickyin.bigdata.java;

import java.util.ArrayList;
import java.util.List;

public class Java16_Class {
    public static void main(String[] args) {
        //所谓泛型，其实是对类型的约束
        List<String> list = new ArrayList<String>();
        List list2 = new ArrayList();

        System.out.println("------------泛型不变性");
        //todo 会报错，在Java中称之为泛型不变性(约定了泛型的就不应该改变,不管父类子类)，就是声明的时候不能改变,但是添加数据的时候可以添加子类
        //List<Person16> list1 = new ArrayList<User16>();
        List<Person16> list1 = new ArrayList<Person16>();
        list1.add(new User16());

        System.out.println("------------泛型的作用域");
        //泛型的作用域,对声明泛型后的逻辑操作进行类型的约束,对之前的操作约束不了
        List list3 = new ArrayList();
        list3.add(new Student());
        List<Person16> personList = list3;
        //todo 约定了泛型,但是放入了与泛型没关系的类型,下一行代码没有报错,没有报错的原因是我们并没有用到 Person16 这个类型,当我们用的时候就会报错
        System.out.println(personList);

        //todo 这里就会报错 com.rickyin.bigdata.java.Student cannot be cast to com.rickyin.bigdata.java.Person16
        for (Person16 person16 : personList) {
            System.out.println(person16);
        }
    }
}
class Person16{

}
class User16 extends Person16{

}
class Student{

}