package com.pn.core;

/**
 * created by : pnema
 * on 7/17/2021
 */
public class KthLargestElement {

    public static void main(String[] args) {
        int k = 2;
        int arr[] = {2, 2, 4, 10 , 3, 1, 5, 6, 4}; // 1,2,3,4,5,6

        System.out.println(getKthLaregstElement(arr, 0, arr.length - 1, arr.length - k));
    }

    static int getKthLaregstElement(int[] arr, int low, int high, int k) {
        if (k >= 0 && k <= high - low + 1) {
            int pi = partition(arr, low, high);

            if (pi - low == k) {
                return arr[pi];
            }
            if (pi - low > k) {
                //search in left portion
                return getKthLaregstElement(arr, low, pi - 1, k);
            }
                //search in right portion
            return  getKthLaregstElement(arr, pi + 1, high, k - pi + low - 1);

        }
        return -1;
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        for (int j = low + 1; j < arr.length; j++) {

            if (arr[j] < pivot) {
                ++i;
                swap(arr, i, j);

            }
        }
        swap(arr, i, low);
        return i;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
