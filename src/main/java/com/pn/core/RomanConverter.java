package com.pn.core;

import java.util.HashMap;
import java.util.Map;

/**
 * created by : pnema
 * on 7/6/2021
 */
public class RomanConverter {

    public static void main(String[] args) {
        //TODO: Code stuff here
        getSum("IV");
    }

    private static int getSum(String roman) {
        Map<Character, Integer> romanNumerals = new HashMap<>();
        romanNumerals.put('I', 1);
        romanNumerals.put('V', 5);
        romanNumerals.put('X', 10);
        romanNumerals.put('L', 50);
        romanNumerals.put('C', 100);
        romanNumerals.put('D', 500);
        romanNumerals.put('M', 1000);

        int sum=0;
        for(int i=0; i< roman.length(); i++){
            char currentChar= roman.charAt(i);
            if(currentChar == 'I' && i+1 <roman.length() && roman.charAt(i+1)=='V'){
                sum+=4;
                ++i;
            }
            if(romanNumerals.containsKey(currentChar)){
                sum+=romanNumerals.get(currentChar);
            }
            else{
                return 0;
            }
        }
        return sum;

    }
}
