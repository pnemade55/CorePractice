package com.pn.core;

/**
 * created by : pnema
 * on 6/20/2021
 */
public class RotateArrayKtimes {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5};
        int rotate= 3;

        System.out.println("\n-------Cockwise-------------------");
        rorateClockwise(arr, rotate);

        System.out.println("\n----------Clockwise nonRecursive----------------");
        int arr2[] ={1,2,3,4,5};
        roratClockwiseIteration(arr2, rotate);


        System.out.println("\n----------AntiClockwise----------------");
        int arr1[] ={1,2,3,4,5};
        roratAntiClockwise(arr1, rotate);

    }

    private static void roratClockwiseIteration(int[] arr2, int rotate) {
        for(int i=1; i<= rotate; i++)
            rotateByOneleft(arr2);

        printarray(arr2);
    }

    private static void rotateByOneleft(int[] arr) {
        int first = arr[0];
        for(int j=1; j<arr.length; j++){
            arr[j-1]=arr[j];
        }
        arr[arr.length-1]=first;
    }

    private static void roratAntiClockwise(int[] arr, int rotate) {
        for(int i=1; i<= rotate; i++)
            rotateByOneright(arr);

        printarray(arr);
    }

    private static void rotateByOneright(int[] arr) {
        int last = arr[arr.length-1];
        for(int j=arr.length-1; j>0; j--){
            arr[j]=arr[j-1];
        }
        arr[0]=last;
    }

    private static void rorateClockwise(int[] arr, int rotate) {
        reverseArray(arr, 0, rotate-1);
        reverseArray(arr, rotate, arr.length-1);
        reverseArray(arr, 0, arr.length-1);

        printarray(arr);
    }

    private static void printarray(int[] arr) {
        for(int a: arr)
            System.out.print(a+ " ");
    }

    private static void reverseArray(int arr[], int start, int end) {
        int temp;
        if(start >= end) {
            return;
        }
        temp= arr[start];
        arr[start]= arr[end];
        arr[end]= temp;

        reverseArray(arr, start+1, end-1);
    }
}
