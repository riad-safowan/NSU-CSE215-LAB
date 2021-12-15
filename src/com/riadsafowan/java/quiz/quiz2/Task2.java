package com.riadsafowan.java.quiz.quiz2;

import java.util.Scanner;

class Date {
    int year;
    int month;
    int day;

    public Date() {
    }

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
}

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your birth year: ");
        int year = scanner.nextInt();
        System.out.print("Enter your birth month: ");
        int month = scanner.nextInt();
        System.out.print("Enter your birth day: ");
        int day = scanner.nextInt();

        Date birthday = new Date(year, month, day);

        System.out.println("Your birthday is on " + birthday.day + "/" + birthday.month + "/" + birthday.year);
    }
}


