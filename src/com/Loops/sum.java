package com.Loops;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        System.out.println("Enter input");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digit;
        int sum=0;
// 459
        while(n>0){
            digit = n % 10;
            sum+=digit;
            n = n / 10;
        }
        System.out.println(sum);
    }

}
