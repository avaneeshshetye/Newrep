package com.Recursion;

import java.util.Scanner;

public class count7 {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Entered number: " + n);
        int count=0;
        int result = number_Of_Sevens(n);
        System.out.println(result);
    }

    public static int number_Of_Sevens(int n){
        int digit=n%10;
        if(n == 0){
            return 0;
        }
        if(digit%7==0){
            return 1+number_Of_Sevens(n/10);
        }
        else{
            return 0+ number_Of_Sevens(n / 10);
        }

    }
}
