package com.decisionlearning;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {

        System.out.println("Enter the amount");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        System.out.println("Entered amount " + amount);
        int discount = 0;

        if(amount > 5000 && amount <= 20000){
            discount = amount * 12/100;
            amount -= discount;

            System.out.println("Price after discount " + amount);
        }
        else if(amount > 20000){
                discount = (int) (amount * 20.0 /100);
                amount -= discount;
                System.out.println("Price after discount " + amount);
        }
        else if(amount <= 5000){
                discount = (int) ( amount * 10.0 /100);
                amount -= discount;
            System.out.println("Price after discount " + amount);
        }
        else{
            System.out.println("Not a valid amount, try again");
        }
    }
}
