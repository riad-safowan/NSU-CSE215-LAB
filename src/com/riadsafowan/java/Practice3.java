package com.riadsafowan.java;

import java.util.Scanner;

public class Practice3 {
    //   1. Write a java program to print the factorial of a number by defining a method named 'Factorial'.
    static class Task1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number : ");
            int num = scanner.nextInt();
            System.out.println("Factorial of " + num + " is " + factorial(num));
        }

        private static double factorial(int num) {
            long factorial = 1;
            for (int i = 1; i <= num; i++) {
                factorial = factorial * i;
            }
            return factorial;
        }
    }

    static class Task2 {
        //   2. Write a method named isPrime, which takes an integer as an argument and returns true
        //   if the argument is a prime number, or false otherwise.
        //   Also write main method that displays prime numbers between 1 to 500.
        public static void main(String[] args) {

            for (int i = 1; i <= 500; i++) {
                if (isPrime(i))
                    System.out.print(i + ", ");
            }
        }

        private static boolean isPrime(int num) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
