package com.Arrays;

import java.util.Scanner;

public class min_max {
    public static void main(String[] args) {

        int arr[] = new int[2];
        System.out.println("Enter 1st number");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        arr[0]=num1;

        System.out.println("Enter 2nd number");
        Scanner sc1 = new Scanner(System.in);
        int num2  = sc1.nextInt();
        arr[1]=num2;

        if(arr[0] > arr[1]){
            System.out.println(arr[0]+ " is the greatest");
        }
        else if(arr[1]>arr[0]){
            System.out.println(arr[1]+" is the greatest");
        }
        else{
            System.out.println("Invalid");
        }
    }


}
