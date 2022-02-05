package com.Arrays;

public class Duplicate {
    public static void main(String[] args) {
        int arr[]= {34,56,34,8,56,97};

        for(int i=0;i<arr.length;i++){

            for(int j=i+1;j<arr.length;j++){


                if(arr[i]==arr[j]){
                    System.out.println(arr[i] + " is a duplicate");

                }

            }
        }
    }

}
