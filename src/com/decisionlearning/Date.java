package com.decisionlearning;

import java.util.Scanner;

public class Date {
    public static void main(String[] args) {
        System.out.println("Rate your stylishness from 1 to 10");
        Scanner sc1 = new Scanner(System.in);
        int you = sc1.nextInt();

        System.out.println("Rate your stylishness from 1 to 10");
        Scanner sc2 = new Scanner(System.in);
        int your = sc2.nextInt();

        int result = date(you, your);
        System.out.println(result);
    }

    public static int date(int you, int your){
        if(you >= 8 || your >= 8){
            System.out.print("Yes ");
            return 2;
        }
         if(you <= 2 || your <= 2){
             System.out.print("No");
             return 1;
         }
         else{
             return -1;
         }

    }
}
