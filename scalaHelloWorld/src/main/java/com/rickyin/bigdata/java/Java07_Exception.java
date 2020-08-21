package com.rickyin.bigdata.java;

import java.util.HashMap;

public class Java07_Exception {
    public static void main(String[] args) {
        try {
            int i = 10;
            int j = 0;
            int z = i / j;
        } catch (ArithmeticException a) {
            System.out.println("ArithmeticException......");
        } catch (Exception e) {
            System.out.println("Exception......");
        } finally {
            System.out.println("finally......");
        }
    }
}
