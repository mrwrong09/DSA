package com.techyogi.dsa.study;

public class MedianOfTwoArray {

    public static void main(String[] args) {
        medianOfTwoArray(new int[]{1,3,5,6,7},new int[]{2,8,9});
    }

    private static void medianOfTwoArray(int[] nums1, int[] nums2) {
        int [] result = mergeArrs(nums1,nums2);
        int n = result.length;
        int mid1 = result[n/2];
        int mid2 = result[(n-1)/2];
        System.out.println((mid1+mid2)/2d);
    }

    private static int[] mergeArrs(int[] nums1, int[] nums2) {
        int i=0,j=0,k=0;
        int [] result = new int[nums1.length+nums2.length];

        while(i<nums1.length && j<nums2.length){
            if (nums1[i]<nums2[j]){
                result[k++] = nums1[i++];
            } else {
                result[k++] = nums2[j++];
            }
        }
        while(i<nums1.length){
            result[k++] = nums1[i++];
        }

        while(j<nums2.length){
            result[k++] = nums2[j++];
        }
        return result;
    }
}
