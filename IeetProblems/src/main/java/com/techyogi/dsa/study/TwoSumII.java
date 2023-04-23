package com.techyogi.dsa.study;

import java.util.Arrays;

/****
 * algo:
 * - take two pointers left=0 and right = n-1;
 * - travers the array till left <= right;
 *      - take a local variable sum = arr[left] + arr [right]
 *      - compare the sum with target
 *          - if sum < target increment left ++;
 *          - if sum > target decrement right --;
 *          - else return left,right
 */
public class TwoSumII {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{3,2,4}, 6)));
    }

    private static int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum < target) {
                left++;
            } else if (sum > target) {
                right--;
            } else {
                return new int[]{left, right};
            }
        }
        return new int[]{};
    }
}
