package com.riadsafowan.java;

import java.util.Scanner;

public class Practice1 {
    static class Task1 {
        //  1.Write a program to find the sum and product of all elements of an array.
        public static void main(String[] args) {
            int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            int sum = 0, product = 1;
            for (int i = 0; i < intArray.length; i++) {
                sum += intArray[i];
            }
            for (int i = 0; i < intArray.length; i++) {
                product *= intArray[i];
            }
            System.out.println("Sum: " + sum);
            System.out.println("Product: " + product);
        }
    }

    static class Task2 {
        //  2.Take 10 integer inputs from user and store them in an array.
//  Now, copy all the elements in an another array but in reverse order.
        public static void main(String[] args) {
            int[] array = new int[10];
            int[] reversedArray = new int[array.length];
            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < 10; i++) {
                System.out.print("Enter a number for array element [" + i + "]: ");
                array[i] = scanner.nextInt();
            }
            System.out.print("\nThe Array: ");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + ", ");
            }
            System.out.println("");

            for (int i = 0; i < array.length; i++) {
                reversedArray[i] = array[array.length - 1 - i];
            }
            System.out.print("The Array in reverse order: ");
            for (int i = 0; i < reversedArray.length; i++) {
                System.out.print(reversedArray[i] + ", ");
            }
        }
    }

    static class Task3 {
        //3.    Print the following patterns using loop :
// a.
// *
// **
// ***
// ****
// b.
//   *
//  ***
// *****
//  ***
//   *
// c.
// 1010101
//  10101
//   101
//    1

        public static void main(String[] args) {
            System.out.println("a.");
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < i + 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println("b.");
            int n = 5; //n should be odd, try 201
            for (int i = 0; i < n; i++) {
                if (i <= n / 2) {
                    for (int j = 0; j < n / 2 - i; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 0; j < i * 2 + 1; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                } else {
                    for (int j = 0; j < i - n / 2; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 0; j < (n - i) * 2 - 1; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
            System.out.println("c.");
            for (int i = 4; i > 0; i--) {
                for (int j = 0; j < 4 - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i * 2 - 1; j++) {
                    if (j % 2 == 1)
                        System.out.print("0");
                    else System.out.print("1");
                }
                System.out.println();
            }
        }
    }
}
