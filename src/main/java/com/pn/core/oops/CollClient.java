package com.pn.core.oops;

import java.util.HashSet;

/**
 * created by : pnema
 * on 7/9/2021
 */
class C{
    private String name;
    C(String name ){
        this.name = name;
    }
    public String toString() {
        return name;
    }
}
public class CollClient {
    public static void main(String[] str) {
        HashSet myMap = new HashSet();
        String s1 = new String("India");
        String s2 = new String("India");
       /* A s3 = new A("France");
        A s4 = new A("France");*/
        myMap.add(s1);
        myMap.add(s2);
       /* myMap.add(s3);
        myMap.add(s4);*/
        System.out.println(myMap);
    }
}

