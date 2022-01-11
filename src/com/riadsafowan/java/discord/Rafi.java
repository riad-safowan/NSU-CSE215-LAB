package com.riadsafowan.java.discord;

import java.util.Scanner;

 class Task2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] arr = new int[100];

        for (int i = 0; i < 100; i++) {
            int a = (int) (Math.random() * 10000);
            arr[i] = a;

        }

        try {
            System.out.println("Enter the index :");
            int b = scan.nextInt();

            if (b < 0 || b > 100) {

                Exception e = new Exception();
                throw e;

            } else {

                System.out.print(b + "index and value is : " + arr[b]);

            }

        } catch (Exception e) {

            System.out.print("Your value is out of range");

        }

    }

}
