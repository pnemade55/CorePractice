package com.pn.core;

/**
 * created by : pnema
 * on 6/23/2021
 */
public class JumpGame2 {

    public static void main(String[] args) {
        int arr[]={2,3,1,5,1,2,1,2,3};

        System.out.println(s4(arr));
    }

    static int jump(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        int lastReach = 0;
        int reach = 0;
        int step = 0;

        for (int i = 0; i <= reach && i < nums.length; i++) {
            //when last jump can not read current i, increase the step by 1
            if (i > lastReach) {
                step++;
                lastReach = reach;
            }
            //update the maximal jump
            reach = Math.max(reach, nums[i] + i);
        }

        if (reach < nums.length - 1)
            return 0;

        return step;
    }
    // Bonus : Greedy O(n) O(1)
    static int s4(int[] arr){
        int n = arr.length, jumps = 0, next_max = 0, cmax = 0;
        for(int i=0;i<n;i++){
            next_max = Math.max(next_max, i+arr[i]);
            if(i==cmax && i != arr.length-1){
                cmax = next_max;
                jumps++;
            }
        }

        return jumps;
    }
}
