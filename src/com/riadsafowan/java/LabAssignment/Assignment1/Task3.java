package com.riadsafowan.java.LabAssignment.Assignment1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int length = scanner.nextInt();
        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter a value for element " + i + ": ");
            array[i] = scanner.nextInt();
        }
        printArray(array);
//b)
        System.out.println("The middle index of the array is " + ((array.length - 1) / 2) + " with the value of " + array[(array.length - 1) / 2]);
//c)
        int min = array[0];
        for (int j : array) if (min > j) min = j;
        System.out.println("The minimum value of the array is " + min);
//d)
        System.out.print("Enter the value to add: ");
        int addition = scanner.nextInt();
        for (int i = 0; i < array.length; i++) array[i] += addition;
        printArray(array);
    }

    public static void printArray(int[] a) {
        for (int i : a) System.out.print(" " + i);
        System.out.println();
    }
}

