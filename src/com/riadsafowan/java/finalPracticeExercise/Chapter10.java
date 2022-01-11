package com.riadsafowan.java.finalPracticeExercise;

import java.awt.*;
import java.util.GregorianCalendar;

public class Chapter10 {
    static class EX10_3 {
        static class MyInteger {
            int value;

            public MyInteger(int value) {
                this.value = value;
            }

            public int getValue() {
                return value;
            }

            public boolean isEven() {
                return value % 2 == 0;
            }

            public boolean isOdd() {
                return value % 2 == 1;
            }

            public boolean isPrime() {
                boolean isPrime = true;
                for (int i = 2; i < value; i++)
                    if (value % i == 0) {
                        isPrime = false;
                        break;
                    }

                return isPrime;
            }

            public static boolean isEven(int value) {
                return value % 2 == 0;
            }

            public static boolean isOdd(int value) {
                return value % 2 == 1;
            }

            public static boolean isPrime(int value) {
                boolean isPrime = true;
                value = value < 0 ? value * -1 : value;
                for (int i = 2; i < value; i++)
                    if (value % i == 0) {
                        isPrime = false;
                        break;
                    }

                return isPrime;
            }

            public static boolean isEven(MyInteger myInteger) {
                return myInteger.value % 2 == 0;
            }

            public static boolean isOdd(MyInteger myInteger) {
                return myInteger.value % 2 == 1;
            }

            public static boolean isPrime(MyInteger myInteger) {
                boolean isPrime = true;
                int value = myInteger.value < 0 ? myInteger.value * -1 : myInteger.value;
                for (int i = 2; i < myInteger.value; i++)
                    if (myInteger.value % i == 0) {
                        isPrime = false;
                        break;
                    }

                return isPrime;
            }

            public boolean equals(int value) {
                return value == this.value;
            }

            public boolean equals(MyInteger myInteger) {
                return myInteger.value == this.value;
            }

            public static int parseInt(char[] chars) {
                int length = chars.length, total = 0, n = 0;
                boolean isNegative = chars[0] == '-';
                for (int i = length - 1; i >= (isNegative ? 1 : 0); i--) {
                    if (chars[i] >= '0' && chars[i] <= '9') {
                        total += (chars[i] - '0') * Math.pow(10, n++);
                    } else {
                        System.out.println("Illegal Char Sequence Error!");
                        return -1;
                    }
                }
                if (isNegative)
                    return total * -1;
                return total;
            }

            public static int parseInt(String s) {
                int length = s.length(), total = 0, n = 0;
                boolean isNegative = s.charAt(0) == '-';

                for (int i = length - 1; i >= (isNegative ? 1 : 0); i--) {
                    if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                        total += (s.charAt(i) - '0') * Math.pow(10, n++);
                    } else {
                        System.out.println("Illegal Char Sequence Error!");
                        return -1;
                    }
                }
                if (isNegative)
                    return total * -1;
                return total;
            }
        }

        public static void main(String[] args) {
            MyInteger mInt1 = new EX10_3.MyInteger(1250);
            MyInteger mInt2 = new EX10_3.MyInteger(-1171);

            int int1 = 1234;
            int int2 = -4312;

            System.out.println("Even: " + mInt1.isEven());
            System.out.println("Odd: " + mInt1.isOdd());
            System.out.println("Prime: " + mInt2.isPrime());
            System.out.println("Equals: " + mInt1.equals(int1));
            System.out.println("Equals: " + mInt1.equals(mInt2));

            System.out.println(MyInteger.parseInt("-234123"));
            System.out.println(MyInteger.parseInt(new char[]{'1', '3', '2', '9'}));
        }
    }

    static class EX10_4 {
        static class MyPoint {
            private double x;
            private double y;

            public MyPoint(double x, double y) {
                this.x = x;
                this.y = y;
            }

            public double getX() {
                return x;
            }

            public double getY() {
                return y;
            }

            public double distance(MyPoint p) {
                return Math.sqrt(Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2));
            }

            public double distance(double x, double y) {
                return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
            }
        }

        public static void main(String[] args) {
            MyPoint myPoint = new MyPoint(3, 4);
            System.out.println(myPoint.distance(new MyPoint(6, 8)));
            System.out.println(myPoint.distance(0, 0));
        }
    }

    static class EX10_14 {
        static class MyDate {
            private int year;
            private int month;
            private int day;

            public MyDate() {
                GregorianCalendar calendar = new GregorianCalendar();
                setDate(calendar.getTimeInMillis());
            }

            public MyDate(long timeInMillis) {
                setDate(timeInMillis);
            }

            public int getYear() {
                return year;
            }

            public int getMonth() {
                return month;
            }

            public int getDay() {
                return day;
            }

            public void setDate(long timeInMillis) {
                GregorianCalendar calendar = new GregorianCalendar();
                calendar.setTimeInMillis(timeInMillis);
                year = calendar.get(GregorianCalendar.YEAR);
                month = calendar.get(GregorianCalendar.MONTH);
                day = calendar.get(GregorianCalendar.DATE);
            }

        }
    }
}
