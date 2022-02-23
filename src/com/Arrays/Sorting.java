package com.Arrays;

import java.io.OptionalDataException;

public class Sorting {
    public static void main(String[] args) {
        int arr [] = new int[]{5,88,4,1,19};
        Sort(arr);

    }
    public static void Sort(int arr[]){

        for(int i = 0; i<arr.length; i++){

            for(int j=i+1; j<arr.length;j++){
                int temp =0;
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println(arr[i]);
        }


    }
}
