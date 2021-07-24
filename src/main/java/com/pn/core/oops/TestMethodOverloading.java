package com.pn.core.oops;

/**
 * created by : pnema
 * on 7/23/2021
 */
public class TestMethodOverloading {
    public static void main(String[] args) {
        m1(null);
    }
    static void m1(String s){
        System.out.println("String");
    }
    static void m1(Object o){
        System.out.println("object");
    }
}
