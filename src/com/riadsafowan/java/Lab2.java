package com.riadsafowan.java;

import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {

//  1. Write a program that takes an integer and determines if it’s odd or even. Use switch cases to produce result.
        System.out.print("\nEnter a number: ");
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();

        switch (inputNum % 2) {
            case 1:
                System.out.println(inputNum + " is an odd number.");
                break;
            case 0:
                System.out.println(inputNum + " is an even number.");
                break;
        }

//  2. Write a program that takes an integer and determines if it’s prime or not. A number is prime if it is divisible by 1 and itself only, i.e. 2, 3, 11, 37 etc.
        boolean isPrime = true;
        for (int i = 2; i < inputNum; i++) {
            if (inputNum % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime)
            System.out.println(inputNum + " is a Prime Number.");
        else System.out.println(inputNum + " is not a Prime Number.");


//  3. Write a program that prints the multiplication table from 1 to 5.
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "x" + j + " = " + i * j);
            }
            System.out.println();
        }

//  4. Write a program that takes an integer and prints its divisors, i.e. divisors of 12 are 1, 2, 3, 4, 6.
        for (int i = 1; i <= inputNum; i++) {
            if (inputNum % i == 0) {
                System.out.print(i + ", ");
            }
        }
    }
}
