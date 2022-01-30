package com.decisionlearning;

import java.util.Scanner;

public class notes {
    public static void main(String[] args) {

        System.out.println("Enter amount: ");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        System.out.println(amount + " rupees");

        int cost = 0;
        if(amount >= 2000){
            //cost = amount/2000;
            //amount -= cost * 2000;
            cost = amount%2000;
        }
        if(amount >= 500){
          //  cost = amount/500;
          //  amount -= cost * 500;
            cost = amount%500;
        }
        if(amount >= 100){
          //  cost = amount/100;
          //  amount -= cost * 100;
            cost = amount%100;
        }
        if(amount >= 50){
           // cost = amount/100;
           // amount -= cost * 50;
            cost = amount%50;
        }
        if(amount >= 20){
            //cost = amount/20;
           // amount -= cost * 20;
            cost = amount%20;
        }
        if(amount >= 1){
            cost =amount/1;
            amount -= cost *1;
            cost = amount%1;
        }
        System.out.println();






    }
}
