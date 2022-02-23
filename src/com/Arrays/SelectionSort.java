package com.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = new int[]{55, 72, 99, 183, 42};
        Sort(arr);
        printarray(arr);
    }

        public static void Sort(int []arr){
            for (int i = 0; i < arr.length; i++) {
                int Smallest = arr[i];
                int smallindex = i;


                for (int j = i + 1; j < arr.length; j++) {
                    if (Smallest > arr[j]) {
                        Smallest = arr[j];
                        smallindex = j;
                    }
                }


                arr[smallindex] = arr[i];
                arr[i] = Smallest;



            }


        }
        public static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        }
    }


