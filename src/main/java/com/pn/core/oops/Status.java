package com.pn.core.oops;

/**
 * created by : pnema
 * on 7/8/2021
 */
enum Status{
    PASS("Pass","succefully passed exam"),
    FAIL("Fail","Failed the exam !!");

    String name;
    String value;

    Status(String name, String value){
        this.name= name;
        this.value= value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

