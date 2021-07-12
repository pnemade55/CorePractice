package com.pn.core.oops;

/**
 * created by : pnema
 * on 6/24/2021
 */
public class ExceptionExample {

    public static void main(String[] args) {
        try {
            int a = 25/0;
        }catch (ArithmeticException a){
            System.out.println("ArithmeticException catch");
            int b= 25/0;
        }catch (ArrayIndexOutOfBoundsException a){
            System.out.println("ArrayIndexOutOfBoundsException catch");
        }catch (Exception e){
            System.out.println("Exception catch");
        }finally {
            System.out.println("finally");
        }
    }
}
