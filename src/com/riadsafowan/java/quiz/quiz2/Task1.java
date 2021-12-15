package com.riadsafowan.java.quiz.quiz2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double firstNum = scanner.nextDouble();
        System.out.print("Enter the operator(+,-,*,/) sign: ");
        char operator = scanner.next().charAt(0);
        System.out.print("Enter the second number: ");
        double secondNum = scanner.nextDouble();

        switch (operator) {
            case '+' -> System.out.println(firstNum + " + " + secondNum + " = " + add(firstNum, secondNum));
            case '-' -> System.out.println(firstNum + " - " + secondNum + " = " + subtract(firstNum, secondNum));
            case '*' -> System.out.println(firstNum + " * " + secondNum + " = " + multiply(firstNum, secondNum));
            case '/' -> System.out.println(firstNum + " / " + secondNum + " = " + divide(firstNum, secondNum));
        }
    }

    static double add(double n1, double n2) {
        return n1 + n2;
    }

    static double subtract(double n1, double n2) {
        return n1 - n2;
    }

    static double multiply(double n1, double n2) {
        return n1 * n2;
    }

    static double divide(double n1, double n2) {
        if (n2 != 0) return n1 / n2;
        else System.out.println("Denominator cannot be 0");
        return 0;
    }
}
