package com.decisionlearning;


import java.util.Scanner;

public class Party {
    public static void main(String[] args) {
        System.out.print("Enter the amount of cup of tea: ");
        Scanner sc = new Scanner(System.in);
        int tea = sc.nextInt();

        System.out.print("Enter the number of candies: ");
        Scanner sc1 = new Scanner(System.in);
        int candy = sc.nextInt();

        int result = party(tea, candy);
        System.out.println(result);
    }

    public static int party(int tea, int candy) {
        if (tea >= 5 && candy >= 5) {
            System.out.println("good");
            return 1;
        } else if ((tea >= candy * candy || candy >= tea * tea) && (tea >= 5 && candy >= 5)) {
            System.out.println("great");
            return 3;
        } else {
            System.out.println("Bad");
            return 0;

        }
    }
}
