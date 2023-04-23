package com.techyogi.dsa.study;

import java.util.Arrays;

public class RemoveElementFromArray {

    public static void main(String[] args) {
        System.out.println(removeTargetElementFromArray(new int[]{0, 1, 5, 1, 3, 2, 2,1,1,2}, 1));
        //removeTargetUsingExtraSpace(new int[]{3, 1, 5, 1, 3, 2, 4}, 1);
    }

    private static int removeTargetElementFromArray(int[] arr, int target) {
        int reader = 0, writer = 0;
        while (reader < arr.length) {
            if (arr[reader] != target) {
                arr[writer++] = arr[reader];
            }
            reader++;

        }
        System.out.println(Arrays.toString(arr));
        return writer + 1;
    }

    private static void removeTargetUsingExtraSpace(int [] arr,int target){

        int [] resultArr = new int[arr.length-1];

        for (int reader=0,writer=0;reader<arr.length;reader++){
            if (arr[reader] !=target){
                resultArr[writer] = arr[reader];
                writer++;
            }
        }
        System.out.println("using for loop: "+Arrays.toString(resultArr));
    }
}
