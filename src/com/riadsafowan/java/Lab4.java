package com.riadsafowan.java;

import java.util.Scanner;

public class Lab4 {
    static class Task1 {
        //  1. Declare an integer array of size 6, initialize it with user input, calculate and print the average.
//     Now calculate the percentage of numbers that are above that average.For example: if 3 of the array elements
//     are greater than average, percentage is: 3 * 100 / 6 = 50%
        public static void main(String[] args) {
            int[] ints = new int[6];
            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < ints.length; i++) {
                System.out.print("Input integer " + i + " :");
                ints[i] = scanner.nextInt();
            }
            int total = 0;
            for (int i = 0; i < ints.length; i++) {
                total += ints[i];
            }
            int avg = total / ints.length;
            System.out.println("Average = " + avg);
            int aboveAvg = 0;
            for (int i = 0; i < ints.length; i++) {
                if (ints[i] > avg) {
                    aboveAvg++;
                }
            }
            int pAbvAvg = aboveAvg * 100 / ints.length;
            System.out.println("There are " + pAbvAvg + "% of numbers above average");
        }
    }

    static class Task2 {
        //  2. Take an integer from user, generate that many fibonacci numbers and store in an array. Display the array.
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number for fibonacci :");
            int num = scanner.nextInt();
            int[] array = new int[num];

            for (int i = 0; i < num; i++) {
                if (i == 0) {
                    array[i] = 0;
                } else if (i == 1) {
                    array[i] = 1;
                } else {
                    array[i] = array[i - 1] + array[i - 2];
                }
            }

            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }

    static class Task3 {
        //  Take a 3X3 array and initialize it with these values:
//  3 4 9
//  2 9 11
//  4 6 0
//  Calculate and print the sum for each row, column and both diagonals.
        public static void main(String[] args) {
            int rows, cols, sumRow, sumCol, sumD = 0;
            int[][] a = {
                    {3, 4, 9},
                    {2, 9, 11},
                    {4, 6, 0}};

            rows = a.length;
            cols = a[0].length;
            for (int i = 0; i < rows; i++) {
                sumRow = 0;
                for (int j = 0; j < cols; j++) {
                    sumRow += a[i][j];
                }
                System.out.println("Sum of row " + i + " = " + sumRow);
            }
            System.out.println();
            for (int i = 0; i < cols; i++) {
                sumCol = 0;
                for (int j = 0; j < rows; j++) {
                    sumCol += a[j][i];
                }
                System.out.println("Sum of column " + i + " = " + sumCol);
            }
            System.out.println();

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (i == j)
                        sumD += a[i][j];
                }
            }
            System.out.println(sumD);

            sumD = 0;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (i + j == a.length - 1)
                        sumD += a[i][j];
                }
            }
            System.out.println(sumD);
        }
    }

    static class Task4 {
        //  4. Take an integer array and print only the numbers that are in consecutive orders of 3.
        public static void main(String[] args) {
            int[] array = {1, 2, 3, 2, 2, 2, 1, 1, 4, 4, 4, 3, 3};
            System.out.print("Outputs :");
            for (int i = 0; i < array.length - 3; i++) {
                if (array[i] == array[i + 1] && array[i + 1] == array[i + 2]) {
                    System.out.print(array[i] + " ");
                }
            }
        }
    }
}
