package com.riadsafowan.java;

import java.util.Scanner;

public class Practice2 {

    public static void main(String[] args) {
//        1.
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = scanner.nextInt();
        System.out.println("Is the number " + num + " divisible by 5? : " + isDivisibleBy5(num));
//        2.
        int chickens, cows, pigs;
        System.out.print("Enter the number of chickens: ");
        chickens = scanner.nextInt();
        System.out.print("Enter the number of cows: ");
        cows = scanner.nextInt();
        System.out.print("Enter the number of pigs: ");
        pigs = scanner.nextInt();

        System.out.println("Total legs of " + chickens + " chickens, " + cows + " Cow and " + pigs + " pig : " + totalLegs(chickens, cows, pigs));
//        3.
        System.out.print("Enter a number: ");
        num = scanner.nextInt();
        System.out.println(num + " incremented by 1 : " + addOne(num));
    }

    //1.
    static Boolean isDivisibleBy5(int num) {
        return num % 5 == 0;
    }

    //2.
    static int totalLegs(int chickens, int cows, int pigs) {
        return chickens * 2 + cows * 4 + pigs * 4;
    }

    //3.
    static int addOne(int num) {
        return num + 1;
    }
}