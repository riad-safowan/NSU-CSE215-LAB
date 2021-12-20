package com.riadsafowan.java.labMid;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int input;
        char ch = 'n';
        do {
            if (total != 0) {
                System.out.println("Do you want to quit? y/n");
                ch = scanner.next().charAt(0);
            }

            System.out.print("Enter a number to add: ");
            input = scanner.nextInt();

            if (ch == 'y' || input > 50) {
                System.out.println("Total:" + total);
            }

            if (input >= 20 && input <= 50) {
                total += input;
                System.out.println("current total = " + total);
            }
        } while (input <= 50 && ch != 'y');

    }
}
