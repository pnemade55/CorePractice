package com.pn.core.oops;

/**
 * created by : pnema
 * on 7/10/2021
 */
public class ExmplemethodOverload {
    public static void main(String[] args) {
        ExmplemethodOverload exmplemethodOverload= new ExmplemethodOverload();
        exmplemethodOverload.m1(new String("Parag"));
    }

    public void m1(String str){
        System.out.println("m1 string");
    }

    public void m1(Object str){
        System.out.println("m1 buffer");
    }
}

class Exmp1 extends ExmplemethodOverload{
    @Override
    public void m1(String str) {
        super.m1(str);
    }

    @Override
    public void m1(Object str) {
        super.m1(str);
    }
}
