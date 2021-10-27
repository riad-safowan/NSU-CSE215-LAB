package com.riadsafowan.java;

public class Lab3 {
    public static void main(String[] args) {

//  1. Generate a random integer n between 5 and 20 (inclusive). Use for loop to print all integers from 0 to n separated by a space.
//     To generate a random integer between min and max range:
        int n = (int) (5 + Math.random() * (20 - 5 + 1));
        System.out.println("Random integer: " + n);

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");


//  2. Print the following
//         12345
//         1234
//         123
//         12
//         1
        for (int i = 5; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();


//  3. Write a program which will use while loop to print all the integers between 100 and 150 which are divisible by 8 in descending order.
        System.out.print("Output: ");
        int num = 150;
        while (num >= 100) {
            if (num % 8 == 0) {
                System.out.print(num + ", ");
            }
            num--;
        }
        System.out.println("\n");

//  4. Generate a random int between 1990 and 2020. Then print it check if it’s a leap year or not.
        int year = (int) (1990 + Math.random() * (2000 - 1990 + 1));

        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + ": True");
        } else {
            System.out.println(year + ": False");
        }
        System.out.println();


//  5. Print the following pattern:
//        *
//        +++
//        *****
//        +++++++
//        *********
        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 1) {
                for (int j = 1; j < i * 2; j++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                for (int j = 1; j < i * 2; j++) {
                    System.out.print("+");
                }
                System.out.println();
            }
        }
    }
}
