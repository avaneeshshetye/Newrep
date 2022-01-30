package com.decisionlearning;

import java.util.Scanner;

public class teen_using_function {
    public static void main(String[] args) {
        System.out.println("Enter first number");
        Scanner sc1 = new Scanner(System.in);
        int num1 = sc1.nextInt();

        System.out.println("Enter second number");
        Scanner sc2 = new Scanner(System.in);
        int num2 = sc2.nextInt();

        System.out.println("Enter third number");
        Scanner sc3 = new Scanner(System.in);
        int num3 = sc3.nextInt();
        int result = fix_teen(num1,num2,num3);
        System.out.println(result);
    }
    public static int fix_teen(int num1, int num2, int num3){
        if (num1 >= 13 && num1 <= 19 && num1 != 15 && num1 != 16) {

            num1 = 0;
        }
        if (num2 >= 13 && num2 <= 19 && num2 != 15 && num2 != 16) {

            num2 = 0;
        }
        if (num3 >= 13 && num3 <= 19 && num3 != 15 && num3 != 16) {

            num3 = 0;
        }

        return num1+num2+num3;



    }
}



