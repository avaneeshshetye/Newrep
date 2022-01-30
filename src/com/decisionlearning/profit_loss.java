package com.decisionlearning;

import java.util.Scanner;

public class profit_loss {
    public static void main(String[] args) {
        System.out.println("Enter cost price");
        Scanner sc1 = new Scanner(System.in);
        int cp = sc1.nextInt();

        System.out.println("Enter selling price");
        Scanner sc2 = new Scanner(System.in);
        int sp = sc2.nextInt();

        int profit = 0;
        int loss = 0;


        if(sp > cp){

            profit = sp - cp;
            System.out.println("Congratulations! Its a profit of " + profit + " rupees");

        }
        else if(cp > sp){
            loss = cp - sp;
            System.out.println("Its a loss of " + loss + " rupees");

        }
        else{
            System.out.println("Invalid input");
        }



    }
}
