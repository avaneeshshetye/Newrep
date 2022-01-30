package com.decisionlearning;

import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        System.out.println("******Welcome to our library!******");

        System.out.print("Whats the number of days you want this book for?: ");
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        System.out.println("You have chosen " + days + " days");
        int charge = 0;

        //Try in reverse order of values for eg. if(21) at first and days<=7 at the end

        if(days <= 7){
            charge = 5 * days;
            System.out.println("You have been charged " + charge + " for " + days + " days");
        }
        else if(days >= 8 && days <= 15){
            charge = 15 * days;
            System.out.println("You have been charged " + charge + " for " + days + " days");

        }
        else if(days >= 16 && days <= 21){
            charge = 30 * days;
            System.out.println("You have been charged " + charge + " for " + days + " days");

        }
        else if(days > 21){
            charge = 40 * days;
            System.out.println("You have been charged " + charge + " for " + days + " days");


        }
        else{
            System.out.println("Invalid input");
        }


    }
}
