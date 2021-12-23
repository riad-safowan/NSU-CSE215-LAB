package com.riadsafowan.java;

import java.util.Scanner;

public class Lab13 {
    public static void main(String[] args) {

        int[] n = new int[10];
        try {
            for (int i = 0; i < 10; i++) {
                n[i] = takePositiveInt();
            }
        } catch (Exception e) {
            System.out.println("Entered a negative number");
        }

    }

    public static int takePositiveInt() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter positive number");
        int n = scanner.nextInt();
        if (n < 0) {
            throw new Exception();
        }
        return n;
    }
}
