package com.Loops;

import java.util.Scanner;

public class Sum_of_n {
    public static void main(String[] args) {

        System.out.println("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i =0;
        int temp = 0;
        while(i<=n){
            i++;
            int i1 = i;
             temp+=n;
        }
        System.out.println(temp);
    }




}
