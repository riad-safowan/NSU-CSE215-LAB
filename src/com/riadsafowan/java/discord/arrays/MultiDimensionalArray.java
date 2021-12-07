package com.riadsafowan.java.discord.arrays;

import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {

        int[][] array = new int[10][10];

        inputArray(array);
        printArray(array);
        printSum(array);
        shuffleArray(array);
    }

    public static void inputArray(int[][] a) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
//                a[i][j] = scanner.nextInt();
                a[i][j] = (int) (Math.random() * 99); // random value
            }
        }
    }

    public static void printArray(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(String.format("%2d", a[i][j]) + " ");
            }
            System.out.println();
        }
    }

    private static void printSum(int[][] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                sum += a[i][j];
            }
        }
        System.out.println("sum: " + sum);
    }

    private static void shuffleArray(int[][]a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                int i1 = (int)(Math.random() * a.length);
                int j1 = (int)(Math.random() * a[i].length);

                int temp = a[i][j];
                a[i][j] = a[i1][j1];
                a[i1][j1] = temp;
            }
        }

        printArray(a);
    }

}
