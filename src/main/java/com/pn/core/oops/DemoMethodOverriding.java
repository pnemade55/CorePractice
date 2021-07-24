package com.pn.core.oops;

/**
 * created by : pnema
 * on 7/23/2021
 */
public class DemoMethodOverriding {
     public void m1() throws ArithmeticException{
         System.out.println("m1 unchecked");
     }
}

class DemoMethodOverriding2 extends DemoMethodOverriding{

    public void m1() {
        System.out.println("m1 overriden unchecked");
    }
}
class DemoMethodOverriding3 extends DemoMethodOverriding2{

    public void m1() {
        System.out.println("m1 overriden unchecked");
    }
}


class DemoMethodOverriding4 {
    public static void main(String[] args) {
        DemoMethodOverriding d= new DemoMethodOverriding2();
        d.m1();

        System.out.println(d instanceof DemoMethodOverriding2);

        System.out.println(d instanceof DemoMethodOverriding);

        System.out.println(d instanceof DemoMethodOverriding3);

    }
}