package com.pn.core;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * created by : pnema
 * on 6/9/2021
 */
public class permutaion {
    public static void main(String[] args) {
        String given = "1234";

        permutate(given);
    }

    private static void permutate(String given) {
        permutat("", given);
    }

    private static void permutat(String per, String given) {
        Map<String, String> permutations = new HashMap<>();

        List<String> permutationList = new ArrayList<>();
        if (given.isEmpty()) {
            permutations.put(per, "");
            permutationList.add(per);

            System.out.println(per);
        } else {
            for (int i = 0; i < given.length(); i++) {
                permutat(per + given.charAt(i), given.substring(0, i) + given.substring(i + 1, given.length()));
            }
        }
    }
}
