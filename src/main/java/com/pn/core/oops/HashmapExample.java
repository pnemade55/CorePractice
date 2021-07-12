package com.pn.core.oops;

import java.util.HashMap;

/**
 * created by : pnema
 * on 7/12/2021
 */
public class HashmapExample {
    public static void main(String[] args) {
        //exampleForStringConcept();
        //StringImmutable();
        HashMap<Student, Integer> students= new HashMap<>();
        Student s1= new Student(1,"parag");
        Student s2= new Student(2,"tejas");
        students.put(s1, 45);
        students.put(s2, 46);

        System.out.println(students.get(s1)); //Prints 45
        System.out.println(students.get(s2)); //Prints 46

        Student s3= new Student(1, "bunty");

        System.out.println(students.get(s3)); //Prints 45
    }

    private static void StringImmutable() {
        String myString = "hey";
        for (int i = 1; i <= 9; i++) {
            myString += "hey";
        }
        System.out.println(myString);

        String s="Rahul";
        s.concat(" Dravid"); //will not work :Once string object is created its data or state can't be changed but a new string object is created.
        System.out.println(s);
        s= s.concat(" Dravid"); // we explicitely assign it to the reference variable, it will work
        System.out.println(s);
    }

    private static void exampleForStringConcept() {
        String e1= "Sandeep";
        String e2= "Parag";

        HashMap hashMap= new HashMap();

        hashMap.put(e1, "G&D");
        hashMap.put(e2, "FIS");

        System.out.println(hashMap.get(e1));
        System.out.println(hashMap.get(e2));

        e1= e2;

        System.out.println(hashMap.get(e1));
        System.out.println(hashMap.get(e2));
    }
}
