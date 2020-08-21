package com.rickyin.bigdata.java;

import java.util.ArrayList;
import java.util.List;

public class Java10_Access {
    public static void main(String[] args) throws CloneNotSupportedException {
        /**
         * TODO 访问权限
         *    1.所谓的权限其实是方法的提供者和调用者之间的关系
         *    2.方法的提供者: java.lang.Object
         *    3.方法的调用者: com.rickyin.bigdata.java.A(×) --> com.rickyin.bigdata.java.Java10_Access(√)
         */
        A a = new A();
        //a.clone(); 报错
        Java10_Access c = new Java10_Access();
        c.clone();
    }
}
class A extends Object{
    public String a = "xxx";
    public void test(){
    }
}