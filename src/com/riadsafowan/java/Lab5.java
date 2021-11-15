package com.riadsafowan.java;

import java.util.Scanner;

public class Lab5 {
    static class Task1 {
        //        1. Write a method countVowels(String arg) that takes a String as parameter and returns the number of vowels.
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a String to count it's vowels : ");
            String text = scanner.next();
            System.out.println("The string has " + countVowels(text) + " vowels");
        }

        public static int countVowels(String arg) {
            int count = 0;
            for (int i = 0; i < arg.length(); i++) {
                switch (arg.charAt(i)) {
                    case 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u' -> count++;
                }
            }
            return count;
        }
    }

    static class Task2 {
        //   2. Write a method isPalindrome(String arg) that determines if a String is palindrome or not.
        //   Palindrome is when a String remains the same after reversing. The method should return boolean type.
        //   For example: MADAM is palindrome.
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a String to check if it is a palindrome : ");
            String text = scanner.next();
            if (isPalindrome(text))
                System.out.println(text + " is a Palindrome");
            else System.out.println(text + " is not a Palindrome");
        }

        public static boolean isPalindrome(String arg) {
            boolean isPalindrome = true;
            for (int i = 0; i < arg.length(); i++) {
                if (arg.charAt(i) != arg.charAt(arg.length() - 1 - i)) {
                    isPalindrome = false;
                    break;
                }
            }
            return isPalindrome;
        }
    }

    static class Task3 {
        //        3. Write a program that has the following static variable - balance (initial value 0) and these static methods:
//        deposit(double amount): Increase account balance
//        withdraw(double amount): Decrease account balance
//      Now run an infinite loop in main program so it displays user with following options:
//      1.   Deposit
//      2.   Withdraw
//      3.   Balance
//      4.   Exit
//        Under each option, the program should ask for appropriate user input (i.e. amount to deposit).
        static double balance = 0.0;

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int menu;
            do {
                System.out.println("1.   Deposit");
                System.out.println("2.   Withdraw");
                System.out.println("3.   Balance");
                System.out.println("4.   Exit");

                System.out.print("select an option: ");
                menu = scanner.nextInt();

                switch (menu) {
                    case 1 -> {
                        System.out.print("Enter the amount of deposite: ");
                        deposit(scanner.nextDouble());
                        System.out.println("Current Balance " + balance);
                    }
                    case 2 -> {
                        System.out.print("Enter the amount of deposite: ");
                        withdraw(scanner.nextDouble());
                        System.out.println("Current Balance " + balance);
                    }
                    case 3 -> balance();
                }
            } while (menu != 4);
        }

        public static void deposit(double amount) {
            balance += amount;
        }

        public static void withdraw(double amount) {
            balance -= amount;
        }

        public static void balance() {
            System.out.println("Current Balance " + balance);
        }

    }
}
