package com.rickyin.bigdata.java;

/**
 * TODO 多态传递
 */
public class Java13_Interface1 {
    public static void main(String[] args) {
        /**
         * TODO 看起来没什么问题,但是我们这里 C13 并没有实现 A13,但是语法上可以这样写,这里有个重要概念叫 多态传递
         */
        A13 a = new C13();
        System.out.println(C13.class.getInterfaces().length); // 打印: 0 说明 C13 并没有实现任何接口
        System.out.println(B13.class.getInterfaces().length); // 打印: 1 说明 B13 实现了1个接口,就是A13
    }
}

interface A13 {
}

class B13 implements A13 {
}

class C13 extends B13 {

}