package com.decisionlearning;

import java.util.Scanner;

public class Speeding_ticket {
    public static void main(String[] args) {
        System.out.print("Your speed was: ");
        Scanner sc1 = new Scanner(System.in);
        int speed = sc1.nextInt();

        System.out.print("Is it your birthday (Y/N)? ");
        Scanner sc2 = new Scanner(System.in);
        String birthday = sc1.next();
        int result = ticket(speed,birthday);
        System.out.println(result);
    }

    public static int ticket(int speed, String birthday) {
        if (speed < 60 || (speed > 60 && speed <= 86 && birthday.equals("Y"))) {
            System.out.println("No ticket");
            return 0;
        } else if (speed > 60 && speed < 81 && birthday.equals("N")) {
            System.out.println("small ticket");
            return 1;
        }
        else if(speed > 81 && birthday.equals("N")){
            System.out.println("Big ticket");
            return 2;
        }

        return speed;
    }
}
