package com.pn.core.sorting;

/**
 * created by : pnema
 * on 6/17/2021
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] input = {4, 2, 3, 7, 5, 9, 1};
        insertionSortStrategy(input, input.length - 1);

        for (int element : input)
            System.out.print(element + " ");
    }

    private static void insertionSortStrategy(int[] input, int size) {
        if (size < 1) return;

        insertionSortStrategy(input, size - 1);   //(i, 2)

        int kth = input[size];
        int j = size - 1;

        while (j >= 0 && input[j] > kth) {
            input[j + 1] = input[j];
            j = j - 1;
        }
        input[j + 1] = kth;
        return;
    }
}
