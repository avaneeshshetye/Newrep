package com.Arrays;

public class smallest {
    public static void main(String[] args) {
        int arr [] = new int[]{22,5,7,21};
        int small = arr[0];
        for(int i=0;i<arr.length;i++){

            if(small > arr[i]){
                small = arr[i];
            }


        }  System.out.println("Smallest number "+ small);
    }
}
