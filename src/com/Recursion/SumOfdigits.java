package com.Recursion;

import java.util.Scanner;

public class SumOfdigits {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Entered number"+ n);
        int result = sum(n);
        System.out.println(result);

    }

    public static int sum(int n){
        if(n==0){
            return 0;
        }
        else{
            return n%10+sum(n/10);

        }
    }
}
