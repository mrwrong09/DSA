package com.techyogi.dsa.study;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseTheIntegerArray {

    public static void main(String[] args) {
        //
        reverseArray(new int[] {1,2,3,4,5});
        optReverseArray(new int[] {1,2,3,4,5});
    }

    private static void reverseArray(int[] arr) {
        int [] resultArr = new int[arr.length];

        int j = resultArr.length-1;
        for (int k : arr) {
            resultArr[j] = k;
            j--;
        }
        System.out.println("BF : "+Arrays.toString(resultArr));
    }

    private static void optReverseArray(int [] arr){
        //time complexity O(n)
        // space complexity O(1)
        int left = 0, right =arr.length-1,temp=0;
        while(left<=right){
            temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
            left++;
            right--;
        }
        System.out.println("Optimized using swapping: "+Arrays.toString(arr));
    }
}
