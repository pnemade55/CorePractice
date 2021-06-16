package com.pn.core.sorting;

/**
 * created by : pnema
 * on 6/16/2021
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] input = {4,2,3,7,5,9,1};
        selectionSortStrategy(input, 7);

        for(int element: input)
            System.out.println(element+" ");
    }

    private static void selectionSortStrategy(int[] input, int size) {
        int temp;
        int minIndex;
        for(int index=0; index <size; index++){
            minIndex= index;                //select the index first
            for (int index2=index+1; index2<size; index2++) {
                if (input[minIndex] > input[index2]) {          //check for lesser element
                    minIndex = index2;                          //swap index with smallest element
                }
            }
            //swap smallest element to first place and so on
            temp = input[index];
            input[index]=input[minIndex];
            input[minIndex]= temp;
        }
    }

}
