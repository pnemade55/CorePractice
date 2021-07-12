package com.pn.core;

/**
 * created by : pnema
 * on 6/26/2021
 */
public class FindDuplicateInArray {
    // Function to print duplicates
    //Works only for atmost 2 duplicates and non zero values.
    void printRepeating(int arr[], int size)
    {
        int i;
        System.out.println("The repeating elements are : ");

        for (i = 0; i < size; i++) {
            int j = Math.abs(arr[i]);
            if (arr[j] >= 0)
                arr[j] = -arr[j];
            else
                System.out.print(j + " ");
        }
    }

    void printDuplicate(){
     int numRay[] = { 0, 4, 3, 2, 7, 8, 2, 3, 1 };

            for (int i = 0; i < numRay.length; i++) {
                numRay[numRay[i] % numRay.length]
                        = numRay[numRay[i] % numRay.length]
                        + numRay.length;
            }
            System.out.println("The repeating elements are : ");
            for (int i = 0; i < numRay.length; i++) {
                if (numRay[i] >= numRay.length * 2) {
                    System.out.println(i + " ");
                }
            }
     }

    // Driver code
    public static void main(String[] args)
    {
        FindDuplicateInArray duplicate = new FindDuplicateInArray();
        int arr[] = { 1, 2, 3, 1, 3, 6, 6 };
        int arr_size = arr.length;

        duplicate.printRepeating(arr, arr_size);

        duplicate.printDuplicate();
    }
}
