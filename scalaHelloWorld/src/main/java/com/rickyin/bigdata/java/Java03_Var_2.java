package com.rickyin.bigdata.java;

import java.lang.reflect.Field;

public class Java03_Var_2 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        /**
         * 字面量:就是后面那个值，比如 “rickyin”、“10”等都是字面量，而name是变量
         *  String name = "rickyin";
         *  int i = 10;
         */

        /**
         * 那如果加了 final 呢？是叫常量吗？(Java中没有常量的概念)
         *  final String name = "rickyin";
         */

        String s = " a b ";

        System.out.println(s);
        Field field = s.getClass().getDeclaredField("value");
        field.setAccessible(true);

        char[] c = (char[]) field.get(s);

        c[2] = 'd';
        System.out.println(s);


    }
}
