package com.Loops;

import java.util.Scanner;

public class Random_toohigh_toolow {
    public static void main(String[] args) {
        {
            int ran = 7;
            int choice = 0 ;
            int result = random(ran,choice);
            System.out.println(result);
        }
    }

        public static int random(int ran, int choice){
            Scanner sc = new Scanner(System.in);
            do {
                System.out.println("Guess the number");

                choice = sc.nextInt();


                if (choice > ran) {
                    System.out.println("Too high,try again");
                } else if (choice < ran) {
                    System.out.println("Too low, try again");
                } else if (choice == ran) {
                    System.out.println("You did it!");
                }


            }while(choice != ran);
            return ran;
        }



    }

