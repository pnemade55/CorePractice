package com.pn.core;

import java.util.*;

/**
 * created by : pnema
 * on 7/12/2021
 */
public class FindStringAnagrams {
    public static void main(String[] args) {
        String[] input = {"cat", "dog", "god", "atc"};
        Arrays.stream(input).forEach(ip -> System.out.print(ip+" "));
        System.out.println();
        performSortingToEachArrayElement(input).forEach((k,v) -> System.out.print("{"+(v.get(0)+1)+","+(v.get(1)+1)+"} "));


    }

    private static HashMap<String, List<Integer>> performSortingToEachArrayElement(String[] input) {
        HashMap<String, List<Integer>> hashMap = new HashMap<>();
        for (int i = 0; i < input.length; i++) {
            String sorted = getSortedString(input[i]);
            if (hashMap.containsKey(sorted)) {
                List<Integer> temp = hashMap.get(sorted);
                temp.add(i);
                hashMap.put(sorted, temp);
            } else {
                List<Integer> temp = new ArrayList<>();
                temp.add(i);
                hashMap.put(sorted, temp);
            }

        }
       return hashMap;
    }

    private static String getSortedString(String s) {
        int[] sortedChar = new int[25];
        for (int i = 0; i < s.length(); i++) {
            sortedChar[s.charAt(i) - 'a'] = 1;
        }
        //System.out.println(Arrays.toString(sortedChar));
        return Arrays.toString(sortedChar);

    }
}
