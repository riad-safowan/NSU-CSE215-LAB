package com.riadsafowan.java;

import com.riadsafowan.Utils;

import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {

//  1. Write a program that prints your name, age and department in console.
        System.out.println("Name: Riad Safowan\n" +
                "Age: 21\n" +
                "Department: ECE");

        Utils.Companion.drawHorizontalLine();

//  2. Write a program that prints from 1 to 10.
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        Utils.Companion.drawHorizontalLine();

//  3. Write a program that determines if an integer is odd or even.
        System.out.print("\nEnter a number: ");
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();
        if (inputNum % 2 == 0) {
            System.out.println(inputNum + " is an even number.");
        } else {
            System.out.println(inputNum + " is an odd number.");
        }
    }
}

