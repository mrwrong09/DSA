package org.example;

import java.util.Arrays;

/**
 * @author satpa
 */
public class RunningAddOfArray {

    static void runningAddOfArray(int[] nums) {
        if (nums.length != 0) {
            for (int i = 1; i <nums.length; i++) {
                nums[i] += nums[i-1];
            }
            System.out.println(Arrays.toString(nums));
        }
    }

    public static void main(String[] args) {
        int [] nums = {1,2,3,4};
        runningAddOfArray(nums);
    }
}