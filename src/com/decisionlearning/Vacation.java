package com.decisionlearning;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        System.out.println("Enter number of the day: ");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        System.out.println("Enter if vacation: ");
        Scanner sc1 = new Scanner(System.in);
        boolean vacation = sc1.hasNext();

        String result = vacation(day,vacation);
        System.out.println(result);
    }

    public static String vacation(int day, boolean vacation){
        if(day >= 2 && day <=6 && !vacation){
            return "7:00";
        }
        else if((day >= 2 && day <= 6) && vacation){
            return "10:00";
        }
        else if((day == 1 || day == 7) && !vacation){
            return "10:00";
        }
        else{
            return "off";
        }
    }
}
