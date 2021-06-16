package com.pn.core.sorting;

/**
 * created by : pnema
 * on 6/16/2021
 */

//Highest time complexity. Not a better way to sort array.
public class BubbleSort {
    public static void main(String[] args) {
        int[] input = {4,2,3,7,5,9,1};
        //bubbleSortStrategyRightToLeft(input, 7);
        bubbleSortStrategyleftToRight(input, 7);

        for(int element: input)
            System.out.print(element+" ");
    }

    private static void bubbleSortStrategyleftToRight(int[] input, int size) {
        int temp;
        for(int i=0; i<size-1; i++){
            for (int j=0; j<size-i-1; j++) {
                if(input[j] > input[j+1]){
                    //swap
                    temp = input[j+1];
                    input[j+1]=input[j];
                    input[j]= temp;
                }
            }
        }
    }

    private static void bubbleSortStrategyRightToLeft(int[] input, int size) {
        int temp;
        for(int i=0; i<size; i++){
            for (int j=size-1; j>i; j--) {
                if(input[j-1] > input[j]){
                    //swap
                    temp = input[j-1];
                    input[j-1]=input[j];
                    input[j]= temp;
                }
            }
        }
    }
}
