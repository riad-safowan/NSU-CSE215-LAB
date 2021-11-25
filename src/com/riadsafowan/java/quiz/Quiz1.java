package com.riadsafowan.java.quiz;

import java.util.Scanner;

public class Quiz1 {
    static class Task1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int first_number, second_number;
            System.out.print("Enter the first number: ");
            first_number = scanner.nextInt();

            System.out.print("Enter the second number: ");
            second_number = scanner.nextInt();

            if (first_number >= 0) {
                if (first_number % 2 == 0) {
                    System.out.println(" First number is: positive and even");
                } else {
                    System.out.println(" First number is: positive and odd");
                }
            } else {
                if (first_number % 2 == 0) {
                    System.out.println(" First number is: negative and even");
                } else {
                    System.out.println(" First number is: negative and odd");
                }
            }
            if (second_number >= 0) {
                if (first_number % 2 == 0) {
                    System.out.println(" Second number is: positive and even");
                } else {
                    System.out.println(" Second number is: positive and odd");
                }
            } else {
                if (second_number % 2 == 0) {
                    System.out.println(" Second number is: negative and even");
                } else {
                    System.out.println(" Second number is: negative and odd");
                }
            }
        }
    }

    static class Task2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int number, sum = 0;

            do {
                System.out.print("Enter the number: ");
                number = scanner.nextInt();
                for (int i = 1; i < number; i++) {
                    if (number % i == 0) {
                        sum += i;
                    }
                }
                if (sum == number)
                    System.out.println("It is a perfect number");
                else System.out.println("It is not a perfect number");

                System.out.println("Do you want to repeat? Y/N");

            } while (scanner.next().charAt(0) != 'N');
        }
    }
}
