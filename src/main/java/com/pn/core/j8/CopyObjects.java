package com.pn.core.j8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * created by : pnema
 * on 7/12/2021
 */
public class CopyObjects {
    public static void main(String[] args) {
        List<X> xl= Arrays.asList(new X(2, "Parag"),new X(1, "Pratik"));

        List<Y> yl = xl.stream().map(e -> new Y(e.getId(), e.getName())).collect(Collectors.toList());

        yl.forEach(yc -> System.out.println(yc.toString()));
    }
}

class Y {
    int id;
    String name;

    Y() {
    }

    public Y(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Y{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

class X {
    int id;
    String name;

    X() { }

    public X(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
