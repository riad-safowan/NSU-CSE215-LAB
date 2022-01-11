package com.riadsafowan.java.discord;

import java.util.Scanner;

class examplearray {
    public static void main(String[] args) {

        int[] b;

        int[] sum;

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter Array Length");

        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Please enter elements in the array");

        for (int j = 0; j < n; j++) {

            a[j] = sc.nextInt();

        }

        printArray(a);
        middle(a);
        minimum(a);
        addelement(a);
    }

    public static void printArray(int a[]) {

        int i;

        for (i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");

        }

    }

    public static void middle(int a[]) {


        int mei = a.length / 2;

        System.out.println("Index of Middle element of array is" + mei);

        System.out.println("Value stored in the Index of Middle element of array is " + a[mei]);

    }

    public static void minimum(int a[]) {

        int smallest = a[0];

        for (int i = 1; i < a.length; i++) {

            if (a[i] < smallest)

                smallest = a[i];

        }

        System.out.println("Smallest Number in array is : " + smallest);

    }

    public static void addelement(int a[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Integer wants add array");

        int e = sc.nextInt();

        for (int i = 1; i < a.length; i++) {

            a[i] = a[i] + e;

        }

        System.out.println(" Array with adding integer" + e);

        for (int i = 0; i < a.length; i++) {

            System.out.print(a[i] + " ");

        }

    }


}
