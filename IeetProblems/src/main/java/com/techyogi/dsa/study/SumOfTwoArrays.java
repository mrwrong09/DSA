package com.techyogi.dsa.study;

import java.util.Arrays;

public class SumOfTwoArrays {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumOfTwoArrays(new int[]{9, 4, 3}, new int[]{9, 4, 9})));
    }

    private static int [] sumOfTwoArrays(int [] arr1, int [] arr2){

        int m =arr1.length,n=arr2.length,carry=0;
        int [] result = new int[Math.max(m,n)];

        int i = arr1.length-1, j = arr2.length-1, k=result.length-1;
        while(i>=0 && j>=0){

            int sum = arr1[i]+arr2[j]+carry;
            result[k] = sum%10; //performing modulus to get the digit (ex: 12%10=2)
            carry = sum/10;
            i--;
            j--;
            k--;
        }

        while(i>=0){
            int sum = arr1[i]+carry;
            result[k] = sum%10;
            carry = sum/10;
            i--;
            k--;
        }

        while(j>=0){
            int sum = arr2[j]+carry;
            result[k] = sum%10;
            carry = sum/10;
            j--;
            k--;
        }
        if (carry>0){
            int [] temp = result;
            result = new int[result.length+1];
            result[0] = 1;

            for (int l=0;l<temp.length;l++){
                result[l+1] = temp[l];
            }
        }
        return result;
    }
}
