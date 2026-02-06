package com.gla.arrays;
public class LC1480 {

        public static int[] runningSum(int[] nums) {
            int a=0;
            int[] nums1 = new int[nums.length];
            for(int i=0;i<nums.length;i++){
                a+=nums[i];
                nums1[i]=a;
            }
            return nums1;
        }

        public static void main(String[] args) {
        }
}