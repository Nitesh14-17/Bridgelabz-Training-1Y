package com.gla.arrays;

public class greatestelement {
    public static void main (String[] args){
        int max=0;
        int arr[]={4,5,69,0,8};
        for(int i=0;i<arr.length;i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }System.out.println("greatest number "+max);

    }
}
