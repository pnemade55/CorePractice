package com.pn.core.j8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * created by : pnema
 * on 7/8/2021
 */
public class DemoForEach {
    public static void main(String[] args) {
        Map<String, String> hm= new HashMap<>();
        hm.put("k1","v1"); hm.put("k2","v2");hm.put("k3","v3");

        hm.forEach((k, v) -> {System.out.println(k +","+ v);});

        List<String> ls= new ArrayList<>();
        ls.add("listE1"); ls.add("listE2");
        ls.forEach(k -> {System.out.println(k);});
        ls.forEach(System.out::println);
    }
}
