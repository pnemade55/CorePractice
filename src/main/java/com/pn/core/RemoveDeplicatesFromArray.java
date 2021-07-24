package com.pn.core;

import java.util.stream.Collectors;

/**
 * created by : pnema
 * on 7/23/2021
 */


public class RemoveDeplicatesFromArray {
    public static void main(String[] args) {
       // int arr[] = {5, 6, 3, 6, 5, 6, 4, 4, 5, 6}; // works only for sorted array

        int arr[] = {1, 3, 3, 5, 5, 5, 6};
        int n = removeduplicates(arr, arr.length);

        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

    }

    private static int removeduplicates(int a[], int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        // creating another array for only storing
        // the unique elements
        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                temp[j++] = a[i];
            }
        }

        temp[j++] = a[n - 1];

        // Changing the original array
        for (int i = 0; i < j; i++) {
            a[i] = temp[i];
        }

        return j;
    }
}
