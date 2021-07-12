package com.pn.core.HackerrankLeetCode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

/**
 * created by : pnema
 * on 7/11/2021
 */
public class MergeIntervalsProblem {
    public static void main(String[] args) {
        Interval arr[]=new Interval[4];
        arr[0]=new Interval(1,3);
        arr[1]=new Interval(4,6);
        arr[2]=new Interval(8,11);
        arr[3]=new Interval(12,14);
        mergeIntervals(arr, new Interval(5,10));
    }
    public static void mergeIntervals(Interval arr[], Interval merge)
    {
        // Test if the given set has at least one interval
        if (arr.length <= 0)
            return;

        // Create an empty stack of intervals
        Stack<Interval> stack=new Stack<>();

        // sort the intervals in increasing order of start time
        Arrays.sort(arr,new Comparator<Interval>(){
            @Override
            public int compare(Interval i1,Interval i2)
            {
                return i1.start-i2.start;
            }
        });

        // push the first interval to stack
        stack.push(arr[0]);

        // Start from the next interval and merge if necessary
        for (int i = 1 ; i < arr.length; i++)
        {
            // get interval from stack top
            Interval top = stack.peek();

            if(top.end > merge.start && top.end < merge.end){
                top.end = merge.end;
                stack.pop();
                stack.push(top);
            }
            // if current interval is not overlapping with stack top,
            // push it to the stack
            if (top.end < arr[i].start) {
                stack.push(arr[i]);
            }
                // Otherwise update the ending time of top if ending of current
                // interval is more
            else if (top.end < arr[i].end)
            {
                top.end = arr[i].end;
                stack.pop();
                stack.push(top);
            }
        }

        // Print contents of stack
        System.out.print("The Merged Intervals are: ");
        Object[] result = stack.toArray();
        for(Object t: result){
            Interval t1= (Interval)t;
            System.out.print("["+t1.start+","+t1.end+"] ");
        }
    }
}
class Interval
{
    int start,end;
    Interval(int start, int end)
    {
        this.start=start;
        this.end=end;
    }
}
