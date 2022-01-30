package com.decisionlearning;

import java.util.Scanner;

public class DOMonth {
    public static void main(String[] args) {
        System.out.println("Enter month number: ");
        Scanner sc = new Scanner(System.in);
        int month_Number = sc.nextInt();

        switch(month_Number){
            case 1:
                System.out.println("You chose month number 1, which is January! This month has 31 days");
                break;
            case 2:
                System.out.println("What year is it?");
                Scanner sc2 = new Scanner(System.in);
                int year = sc2.nextInt();

                if(year%4==0){
                    System.out.println("You chose month number 2, which is February! As its a leap year this month will be having 28 days");
                }
                else{
                    System.out.println("You chose month number 2, which is February! As its not a leap year it would be having 29 days" );
                }
                break;
            case 3:
                System.out.println("You chose month number 3, which is March! This month has 31 days");
                break;
            case 4:
                System.out.println("You chose month number 4, which is April! This month has 30 days");
                break;
            case 5:
                System.out.println("You chose month number 5, which is May! This month has 31 days");
                break;
            case 6:
                System.out.println("You chose month number 6, which is June! This month has 30 days");
                break;
            case 7:
                System.out.println("You chose month number 7, which is July! This month has 31 days");
                break;
            case 8:
                System.out.println("You chose month number 8, which is August! This month has 31 days");
                break;
            case 9:
                System.out.println("You chose month number 9, which is September! This month has 30 days");
                break;
            case 10:
                System.out.println("You chose month number 10, which is October! This month has 31 days");
                break;
            case 11:
                System.out.println("You chose month number 11, which is November! This month has 30 days");
                break;
            case 12:
                System.out.println("You chose month number 12, which is December! This month has 31 days");
                break;
            default:
                System.out.println("Not a valid month,try again");
        }
    }
}
