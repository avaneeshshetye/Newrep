package com.decisionlearning;

import java.util.Scanner;

public class Max_number {
    public static void main(String[] args) {
        System.out.println("Enter number 1");
        Scanner sc1 = new Scanner(System.in);
        int num1 = sc1.nextInt();

        System.out.println("Enter number 1");
        Scanner sc2 = new Scanner(System.in);
        int num2 = sc1.nextInt();

        if(num1 > num2){
            System.out.println(num1 + "Is greater");
        }
        else if(num2 > num1){
            System.out.println(num2 + "Is greater");
        }
        else{
            System.out.println("Invalid Input");
        }




    }
}
