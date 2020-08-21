package com.rickyin.bigdata.java;

public class Java11_Override {
    public static void main(String[] args) {
        BBB bbb = new BBB("asd");

        /**
         * Todo 动态绑定机制: 成员方法执行过程中,JVM会将方法和当前调用对象实际内存进行绑定
         *                 属性没有动态绑定的机制,属性在哪里声明在哪里使用
         */
        //System.out.println(aaa.getResult());
    }
}

class AAA {
    public AAA(String s){
        System.out.println("aaa");
    }
    public int i = 10;
    public int getResult() {
        return getI() + 10;
    }
    public int getI(){
        return i;
    }
}
class BBB extends AAA {
    public BBB(String s){
        super("asd");
        System.out.println("bbb");
    }
    public int i = 20;
//    public int getResult() {
//        return i + 20;
//    }
    public int getI(){
        return i;
    }
}