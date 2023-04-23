package com.techyogi.dsa.study;

import java.util.Arrays;

public class RemoveDuplicateFromArray {

    public static void main(String[] args) {
        System.out.println(removeDuplicateFromArray(new int[]{0, 1, 1, 1, 2, 2, 3, 3, 4}));
    }

    private static int removeDuplicateFromArray(int[] arr) {
        int reader = 0, writer = 0;
        //Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        while (reader < arr.length) {
            if (arr[reader] != arr[writer]) {
                arr[++writer] = arr[reader];
            }
            reader++;

        }
        System.out.println(Arrays.toString(arr));
        return writer + 1;
    }
}
