package com.pn.core.oops;

import sun.plugin.viewer.frame.WNetscapeEmbeddedFrame;

import java.util.LinkedList;

/**
 * created by : pnema
 * on 7/8/2021
 */
public class TestExcptn1 {
    public static void main(String[] args){
        try {
            int a = 50 / 0;
        }catch(ArithmeticException ae){
            System.out.println("ArithmeticException Occured");
            int b= 50 / 0;
        } catch (Exception e){
            System.out.println("Exception Occured");
        }finally {
            System.out.println("Finally !!");
        }

    }
}

