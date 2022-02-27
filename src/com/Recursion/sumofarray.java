package com.Recursion;

public class sumofarray {
    public static void main(String[] args) {
        int arr[]={42,56,3,17};
        int i=0;
        int result=array(arr,i);
        System.out.println(result);
    }
    public static int array(int arr[],int i){


        if(i==arr.length-1){
            return arr[i];
        }
        else{
            return arr[i]+array(arr,i+1);
        }
    }

}
