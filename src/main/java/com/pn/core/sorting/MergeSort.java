package com.pn.core.sorting;

/**
 * created by : pnema
 * on 6/17/2021
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] input = {4, 2, 3, 7, 5, 9, 1};
        mergeSortStrategy(input, 0, input.length - 1);

        for (int element : input)
            System.out.print(element + " ");
    }

    private static void mergeSortStrategy(int[] input, int left, int right) {
        if (left < right) {
            int middle = left + (right - left) / 2;

            mergeSortStrategy(input, left, middle);
            mergeSortStrategy(input, middle + 1, right);

            merge(input, left, middle, right);
        }
    }

    private static void merge(int[] input, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        int[] L = new int[n1];
        int[] R = new int[n2];

        //copy both arrays
        for (int i = 0; i < n1; i++)
            L[i] = input[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = input[middle + 1 + j];

        int i = 0, j = 0;

        int k=left;

        while (i < n1 && j < n2) {
            if (L[i]< R[j]){
                input[k]= L[i];
                i++;
            }
            else{
                input[k] =R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if it has any */
        while (i < n1) {
            input[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if it has any */
        while (j < n2) {
            input[k] = R[j];
            j++;
            k++;
        }

    }

}
