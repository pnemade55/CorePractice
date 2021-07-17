package com.pn.core;

/**
 * created by : pnema
 * on 7/16/2021
 */
public class LarestSmallestInUnSortedArray {
    public static void main(String[] args) {
        int arr[] = {2, 90, 3, 7, 2, 6, 1, 7, 8, 34, 76, 22, 98};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int max_position = -1, min_position = -1;
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] > max) {
                max = arr[index];
                max_position = index;
            }
            if (arr[index] < min) {
                min = arr[index];
                min_position = index;
            }
        }
        System.out.println("Minimum: " + min + " , " + "Maximum: " + max);

        System.out.println("min_position: " + min_position + " , " + "max_position: " + max_position);

    }
}
