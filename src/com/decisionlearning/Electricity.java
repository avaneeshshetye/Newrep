package com.decisionlearning;

import java.util.Scanner;

public class Electricity {
    public static void main(String[] args) {
        System.out.println("Enter units: ");
        Scanner sc1 = new Scanner(System.in);
        int units = sc1.nextInt();
        System.out.println(units + " units");
        int cost = 0;
        int rem_units = 0;

        if(units <= 50 ){
            cost = (int) (0.50 * units);
        }
        if(units >= 50 && units <= 150){
            rem_units = units - 50;
            cost += rem_units*0.75;
        }

        if(units > 150 && units < 250){

            rem_units -= 100;
            cost += rem_units * 1.20;
        }
        //if(units > 250){
        //    rem_units-=
        //}

    }
}
