package com.Arrays;

public class removeduplicates {
    public static void main(String[] args) {

        int arr[] = {7,44,44,56,53};

        for(int i=0;i<arr.length;i++){

            for(int j=i+1;j<arr.length;j++){
                if(arr[i] != arr[j]){
                    System.out.println(arr[i]);
                }

            }
        }
    }
}
