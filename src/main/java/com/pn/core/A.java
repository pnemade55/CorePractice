package com.pn.core;

import java.io.IOException;

/**
 * created by : pnema
 * on 7/15/2021
 */
class A
{
    void m1() throws Exception
    {
        System.out.println("In m1 A");
    }
}
class B extends A
{
    void m1() throws IOException
    {
        System.out.println("In m1 B");
    }
}

class Test {

    public static void main(String[] args) throws Exception {
        A a=new B();
        a.m1();
    }
}