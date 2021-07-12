package com.pn.core.oops;

import java.io.IOException;

/**
 * created by : pnema
 * on 7/8/2021
 */
public class TestExcptn {
    public static void main(String[] args) throws Exception {
        A a = new B();
        a.method1();
    }
}

class A {

    A(){
        System.out.println("A");
    }
    public void method1() throws Exception {
        System.out.println("A: Method1");
    }
}

class B extends A {
    B(){
        System.out.println("A");
    }
    public void method1() throws Exception {
        System.out.println("B: Method1");
    }

    public void method2() {
        System.out.println("B: Method2");
    }
}
