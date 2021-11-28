package com.riadsafowan.java.homework;

import java.util.Scanner;

public class HomeWork1 {
    // 2.6
    static class Task1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number between 0 to 1000 : ");
            int number = scanner.nextInt();
            int digit, sum = 0;
            while (number != 0) {
                digit = number % 10;
                sum = sum + digit;
                number = number / 10;
            }
            System.out.println("The sum of all digits is " + sum);
        }
    }

    // 3.26
    static class Task2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number : ");
            int number = scanner.nextInt();
            System.out.println("Is " + number + " divisible by 5 and 6? : "
                    + (number % 5 == 0 && number % 6 == 0));
            System.out.println("Is " + number + " divisible by 5 or 6? : "
                    + (number % 5 == 0 || number % 6 == 0));
            System.out.println("Is " + number + " divisible by 5 or 6, but not both: "
                    + (number % 5 == 0 ^ number % 6 == 0));
        }
    }

    // 3.23
    static class Task3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter points X coordinate: ");
            float x = scanner.nextInt();
            System.out.print("Enter points Y coordinate: ");
            float y = scanner.nextInt();

            if (Math.abs(x) > 10 / 2 || Math.abs(y) > 5 / 2)
                System.out.println("Point (" + x + "," + y + ") is not in the rectangle");
            else System.out.println("Point (" + x + "," + y + ") is in the rectangle");
        }
    }

    // 4.18
    static class Task4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the code : ");
            String code = scanner.next();
            String ans = "", err = null;
            switch (code.charAt(0)) {
                case 'M', 'm' -> ans = "Mathematics ";
                case 'C', 'c' -> ans = "Computer Science ";
                case 'I', 'i' -> ans = "Information Technology ";
                default -> err = "Invalid Input";
            }
            switch (code.charAt(1)) {
                case '1' -> ans += "Freshman";
                case '2' -> ans += "Sophomore";
                case '3' -> ans += "Junior";
                case '4' -> ans += "Senior";
                default -> err = "Invalid Input";
            }
            if (err == null)
                System.out.println(ans);
            else
                System.out.println(err);
        }
    }

    // 4.21
    static class Task5 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the code : ");
            String ssn = scanner.next();
            boolean isValid = true;

            if (ssn.length() == 11) {
                for (int i = 0; i < 11; i++) {
                    if (i == 3 || i == 6) {
                        if (ssn.charAt(i) != '-') isValid = false;
                    } else {
                        if (ssn.charAt(i) < '0' || ssn.charAt(i) > '9') isValid = false;
                    }
                }
            } else isValid = false;

            if (isValid)
                System.out.println(ssn + " is a valid social security number");
            else System.out.println(ssn + " is not a valid social security number");
        }
    }

    // 6.12
    static class Task6 {
        public static void main(String[] args) {
            printChars('z', '1', 10);
        }

        public static void printChars(char ch1, char ch2, int numberPerLine) {
            int n = 0;
            for (int i = ch1; i <= ch2; i++) {
                System.out.print((char) i + " ");
                n++;
                if (n % numberPerLine == 0)
                    System.out.println();
            }
        }
    }

    // 6.4
    static class Task7 {
        public static void main(String[] args) {
            reverse(123456789);
        }

        private static void reverse(int number) {
            System.out.print("The number " + number + "'s reverse is: ");
            while (number != 0) {
                System.out.print(number % 10);
                number = number / 10;
            }
        }
    }

    // 6.9
    static class Task8 {
        public static void main(String[] args) {
            double foot = 1, meter = 20;
            System.out.println("  Feet         Meter      |      Meter          Feet  ");
            System.out.println("------------------------------------------------------");
            for (int i = 1; i <= 10; i++, foot++, meter += 5) {
                System.out.println(String.format("%5.1f", foot) + "         "
                        + String.format("%6.3f", footToMeter(foot)) + "      |"
                        + "     " + String.format("%5.1f", meter) + "         "
                        + String.format("%7.3f", meterToFoot(meter)));
            }
        }

        private static double footToMeter(double foot) {
            return 0.305 * foot;
        }

        private static double meterToFoot(double meter) {
            return 3.279 * meter;
        }
    }
}
