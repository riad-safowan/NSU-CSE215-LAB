package com.riadsafowan.java.LabAssignment.Assignment1;

public class Task1 {
    public static void main(String[] args) {
        int n;
        for (int i = 1; i <= 14; i++) {
            n = (int) Math.pow(2, i);
            System.out.println("For n=" + String.format("%-5d", n) + " value of (1+(1/n))^n is " + Math.pow((1 + 1.0 / n), n));
        }
    }
}
