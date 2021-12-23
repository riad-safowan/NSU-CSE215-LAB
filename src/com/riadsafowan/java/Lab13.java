package com.riadsafowan.java;

import java.util.Scanner;

public class Lab13 {
    static class Task1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[] array = new int[10];
            System.out.print("Input 10 positive integers: ");
            for (int i = 0; i < 10; i++) {
                try {
                    int inputNum = scanner.nextInt();
                    if (inputNum < 0)
                        throw new Exception();
                    array[i] = inputNum;
                } catch (Exception e) {
                    System.out.println("Input positive integer only !");
                    i--;
                }
            }
            for (int i : array) System.out.print(i + " ");
        }
    }
}
