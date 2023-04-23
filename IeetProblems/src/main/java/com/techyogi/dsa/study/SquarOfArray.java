package com.techyogi.dsa.study;

import java.util.Arrays;

public class SquarOfArray {

    public static void main(String[] args) {

        squarOfArrayElements(new int[] {-4,-1,0,3,10});
    }

    private static void squarOfArrayElements(int[] arr) {
        int [] result = new int[arr.length];
        int left =0, right=arr.length-1;

        for (int i=result.length-1; i>=0;i--){
            if (Math.pow(arr[left],2) > Math.pow(arr[right],2)){
                result[i] = (int) Math.pow(arr[left],2);
                left++;
            }else {
                int sqrtVal = (int) Math.pow(arr[right],2);
                result[i] = sqrtVal;
                right--;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
