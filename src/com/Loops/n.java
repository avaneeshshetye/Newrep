package com.Loops;

import java.util.Scanner;

public class n {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        int x = 9;
        int result = 1;
        int sum = 0;
        generate(choice);



    }

    public static void generate(int choice) {
        int sum = 0;

        for (int i = 0; i < choice; i++) {


            int result = 1;
            for (int j = 1; j <= i; j++) {
                result = result * 10;
            }
            sum += 9 * result;
            System.out.println(sum + "");


        }


    }





        //choice means the power up till it should increment



}




