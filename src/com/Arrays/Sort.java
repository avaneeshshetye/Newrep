package com.Arrays;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int arr[]={56,2,1,45,9};
        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
