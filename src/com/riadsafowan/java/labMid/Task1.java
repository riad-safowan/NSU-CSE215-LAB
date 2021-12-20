package com.riadsafowan.java.labMid;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array lenght: ");
        int lenght = scanner.nextInt();
        int[] array = new int[lenght];
        System.out.print("Enter " + lenght + " element: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Before rearranging:");
        printArray(array);
        fix34(array);
        System.out.println("After rearranging:");
        printArray(array);

    }

    private static void fix34(int[] a) {
        for (int i = 0; i < a.length - 2; i++) {
            if (a[i] == 3) {
                for (int j = 0; j < a.length; j++) {
                    if (a[j] == 4) {
                        int temp = a[i + 1];
                        a[i + 1] = a[j];
                        a[j] = temp;
                    }
                }
                for (int j = 0; j < a.length; j++) {
                    if (a[j] == 5) {
                        int temp = a[i + 2];
                        a[i + 2] = a[j];
                        a[j] = temp;
                    }
                }
                break;
            }
        }
    }

    private static void printArray(int[] a) {
        System.out.print("Array: ");
        for (int j : a) {
            System.out.print(" " + j);
        }
        System.out.println();
    }
}
