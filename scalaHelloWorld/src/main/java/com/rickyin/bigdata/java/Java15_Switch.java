package com.rickyin.bigdata.java;


public class Java15_Switch {
    public static void main(String[] args) {
        int i = 1;
        switch (i){
            case 0:
                break;
            case 1:
                System.out.println("1");
                break;
            default: //当不满足所有case的时候会走 default
                System.out.println("default");
                break;
        }
    }
}
