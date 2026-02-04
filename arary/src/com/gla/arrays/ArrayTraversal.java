package com.gla.arrays;

public class ArrayTraversal {
    public static int[] main (String[] args){
        int[] arr={1,3,44,5,6,8,6};
        int i=0;
        int n= arr.length;
        System.out.print("Traversed Array iz: ");
        while(i<n){
            System.out.print(arr[i] + " ");
            i++;
            
        }
        return arr;
    }
}
