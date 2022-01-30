package com.decisionlearning;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter the first number: ");
        Scanner sc1 = new Scanner(System.in);
        int f_num1 = sc1.nextInt();

        System.out.println("Enter the second number: ");
        Scanner sc2 = new Scanner(System.in);
        int f_num2 = sc1.nextInt();

        System.out.println("Enter the third number: ");
        Scanner sc3 = new Scanner(System.in);
        int f_num3 = sc1.nextInt();

    if(f_num1 < f_num2  && f_num2 < f_num3){
        System.out.println(f_num1 + "," + f_num2 +","+f_num1);
    }
        else if(f_num1 < f_num3 && f_num3 < f_num2){
        System.out.println(f_num2 + "," + f_num3 +","+f_num2);

     }

      if(f_num2 < f_num1 && f_num1 < f_num3){
         System.out.println(f_num2 + "," + f_num1 +","+f_num3);

        }

      else if(f_num2 < f_num3 && f_num3 < f_num1){
          System.out.println(f_num2 + "," + f_num3 +","+f_num1);

      }

      if(f_num3 < f_num2 && f_num2 < f_num1){
        System.out.println(f_num3 + "," + f_num2 +","+f_num1);

    }
      else if(f_num3 < f_num1 && f_num1 < f_num2){
          System.out.println(f_num3 + "," + f_num1 +","+f_num2);
      }




    }
}
