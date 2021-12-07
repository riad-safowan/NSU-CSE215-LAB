package com.riadsafowan.java.discord.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SingleDimensionArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[10];

        // input value to an array
//        for (int i = 0; i < a.length; i++) {
//            a[i]= scanner.nextInt();
//        }

        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 50);
        }

//        int[] b = a.clone();

        printArray(a);
        printSum(a);
        printLargest(a);
        printShuffledArray(a);
        printShiftedArray(a);
        binarySearch(a, a[a.length-1]);

    }

    private static void printArray(int[] a) {
        // print an array
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void printSum(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println("sum: " + sum);
    }

    private static void printLargest(int[] a) {
        int largest = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > largest)
                largest = a[i];
        }
        System.out.println("Largest element: " + largest);
    }

    private static void printShuffledArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int index = (int) (Math.random() * a.length - 1);
            int temp = a[i];
            a[i] = a[index];
            a[index] = temp;
        }
        printArray(a);
    }

    private static void printShiftedArray(int[] a) {
        int temp = a[0];
        for (int i = 1; i < a.length; i++) {
            a[i - 1] = a[i];
        }
        a[a.length - 1] = temp;
        printArray(a);
    }

    private static void sortArray(int[] a) { //array is pass by reference
        int smallest, position;
        for (int i = 0; i < a.length; i++) {
            smallest = a[i];
            position = i;
            for (int j = i + 1; j < a.length; j++) {
                if (smallest > a[j]){
                    smallest = a[j];
                position = j;
                }
            }
            int temp = a[i];
            a[i] = smallest;
            a[position] = temp;
        }
    }

    private static void binarySearch(int[] list, int key) {
        sortArray(list);
//        Arrays.sort(list);
        printArray(list);
        int low = 0;
        int high = list.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid])
                high = mid - 1;
            else if (key == list[mid]) {
                System.out.println(key + " is at position " + mid);
                return;
            } else
                low = mid + 1;
        }
        System.out.println(key + " not found ");
    }

}
