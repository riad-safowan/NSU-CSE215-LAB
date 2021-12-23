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
                        throw new Exception("Input positive integer only !");
                    array[i] = inputNum;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    i--;
                }
            }
            for (int i : array) System.out.print(i + " ");
        }
    }

    static class Task2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[] intArray = new int[100];
            for (int i = 0; i < intArray.length; i++) {
                intArray[i] = (int) (Math.random() * 10000);
            }

            System.out.print("Enter index: ");
            int index = scanner.nextInt();
            try {
                if (index < 0 || index > 99) {
                    throw new Exception("Array Index Out Of Bound");
                }
                System.out.println("The value at index " + index + " is " + intArray[index]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    static class Task3 {
        static class IllegalTriangleException extends Exception {
        }

        static class Triangle {
            private double side1;
            private double side2;
            private double side3;

            public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
                if (side1 + side2 < side3 || side1 + side3 < side2 || side2 + side3 < side1) {
                    throw new IllegalTriangleException();
                }
                this.side1 = side1;
                this.side2 = side2;
                this.side3 = side3;
            }

            public double perimeter() {
                return side1 + side2 + side3;
            }
        }

        public static void main(String[] args) {
            try {
                Triangle t1 = new Triangle(12, 12, 25);
                System.out.println();
            } catch (IllegalTriangleException e) {
                e.printStackTrace();
            }
        }
    }
}
