package com.decisionlearning;

import java.util.Scanner;

public class Squirrel {
    public static void main(String[] args) {
        System.out.println("Enter temperature");
        Scanner sc1 = new Scanner(System.in);
        int temperature = sc1.nextInt();

        System.out.println("Is it summer");
        Scanner sc2 = new Scanner(System.in);
        boolean isSummer = sc2.hasNext();
        boolean result = play(temperature,isSummer);
        System.out.println(result);

    }

    public static boolean play(int temperature, boolean isSummer) {

        if (temperature >= 60 && temperature <= 90 && isSummer == false) {
            return true;
        }
        else if(temperature >= 60 && temperature <= 100 && isSummer == true){
            return true;
        }
        else{
            return false;
        }


    }
}
