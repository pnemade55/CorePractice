package com.pn.core;

import java.util.Arrays;

/**
 * created by : pnema
 * on 6/26/2021
 */
public class RotateArrayOnce {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5};
        rotateAntiClockApproach1BitShifting(arr);
        System.out.println("BitShifting Rotated Array is");
        System.out.println(Arrays.toString(arr));

        int arr1[] ={1,2,3,4,5};
        rotateAntiClockApproach2Swapping(arr1);
        System.out.println("Swapping Rotated Array is");
        System.out.println(Arrays.toString(arr1));

        int arr2[] ={1,2,3,4,5};
        rotateClockApproach1BitShifting(arr2);
        System.out.println("BitShifting Rotated Array is");
        System.out.println(Arrays.toString(arr2));

        int arr3[] ={1,2,3,4,5};
        rotateClockApproach2Swapping(arr3);
        System.out.println("Swapping Rotated Array is");
        System.out.println(Arrays.toString(arr3));

    }

    private static void rotateClockApproach2Swapping(int[] arr) {
        int i = 0, j = arr.length - 1;
        while(i != j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
        }
    }

    private static void rotateClockApproach1BitShifting(int[] arr) {
        int x = arr[0], i;
        for (i = 1; i <= arr.length-1; i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = x;
    }

    private static void rotateAntiClockApproach2Swapping(int arr[])
    {
        int i = 0, j = arr.length - 1;
        while(i != j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
        }
    }

    private static void rotateAntiClockApproach1BitShifting(int[] arr)
    {
        int x = arr[arr.length-1], i;
        for (i = arr.length-1; i > 0; i--)
            arr[i] = arr[i-1];
        arr[0] = x;
    }


}
