package com.Arrays;

public class reverse {
    public static void main(String[] args) {
        int n=0;
        int arr[]={1,5,4,2};
        int i = 0 ;
        int result=0;
        int p;
        int temp1=0;
        System.out.println("Original");
/*
        for( i=0 ; i<arr.length;i++){
            System.out.print( arr[i]);

        }
        */
/*
        for(i=arr.length-1;i>=0;i--){
             result = arr[i];
            System.out.println(result + "");
        }
        */
        // int arr[] = {1,2,3,4};
        int mid = arr.length/2;

            for(i=0;i<=(arr.length/2)-1;i++) {
                p=arr[i];
                arr[i]=arr[arr.length-i-1];
                arr[arr.length-i-1]=p;

            }
            for(i=0;i<arr.length;i++){
                System.out.println(arr[i]);
            }



    }
}
