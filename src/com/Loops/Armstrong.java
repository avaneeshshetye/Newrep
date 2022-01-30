package com.Loops;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        int digit = 0;
        int sum = 0;
        int cube = 1;
        int x = 0;
        int k = 1;

        for(k=0;k<=n;k++) {
            if (method(k)) {
                System.out.println(k);
            }
        }



    }

    public static boolean method(int n){
        int x=n;
        int digit=0;
        int cube = 1;
        int sum = 0;
        int i =0;

        while(x>0){
            digit = x%10;
            for(i=0;i<3;i++){
                cube*=digit;
            }
            sum=sum+cube;
            cube=1;
            x=x/10;
        }

        if(n==sum){
            return true;
        }
        else{
            return false;
        }

    }
}
