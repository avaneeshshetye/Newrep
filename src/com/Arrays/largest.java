package com.Arrays;

public class largest {
    public static void main(String[] args) {
        int arr[] = {77, 83, 99, 5, 0, 8};


        int largest = arr[0];
        for (int i = 1; i <= arr.length-1; i++) {
            {
                if (largest < arr[i]) {
                    largest = arr[i];
                }


            }

        }
        System.out.println(largest);
    }
}





