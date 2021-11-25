package com.riadsafowan.java;

public class Lab6 {
    static class Fraction {
        private int numerator;
        private int denominator;

        public Fraction(int numerator, int denominator) {
            this.numerator = numerator;
            if (denominator != 0)
                this.denominator = denominator;
        }

        public int getNumerator() {
            return numerator;
        }

        public void setNumerator(int numerator) {
            this.numerator = numerator;
        }

        public int getDenominator() {
            return denominator;
        }

        public void setDenominator(int denominator) {
            if (denominator != 0)
                this.denominator = denominator;
        }

        @Override
        public String toString() {
            return "" + numerator + "/" + denominator;
        }

        public void add(Fraction f) {
            int n, d;
            d = this.denominator * f.denominator;
            n = this.numerator * f.denominator + f.numerator * this.denominator;
            Fraction ans = new Fraction(n, d);
            System.out.println(this.toString() + " + " + f.toString() + " = " + ans.toString());
        }

        public void sub(Fraction f) {
            int n, d;
            d = this.denominator * f.denominator;
            n = this.numerator * f.denominator - f.numerator * this.denominator;
            Fraction ans = new Fraction(n, d);
            System.out.println(this.toString() + " - " + f.toString() + " = " + ans.toString());
        }

        public void multiplication(Fraction f) {
            int n, d;
            d = this.denominator * f.denominator;
            n = this.numerator * f.numerator;
            Fraction ans = new Fraction(n, d);
            System.out.println(this.toString() + " * " + f.toString() + " = " + ans.toString());
        }

        public void division(Fraction f) {
            if (f.numerator != 0) {
                int n, d;
                d = this.denominator * f.numerator;
                n = this.numerator * f.denominator;
                Fraction ans = new Fraction(n, d);
                System.out.println(this.toString() + " / " + f.toString() + " = " + ans.toString());
            }
        }
    }

    static class Test {
        public static void main(String[] args) {
            Fraction fr1 = new Fraction(1, 4);
            Fraction fr2 = new Fraction(3, 5);

            System.out.println(fr1.toString());
            fr1.add(fr2);
            fr1.sub(fr2);
            fr1.multiplication(fr2);
            fr1.division(fr2);
        }
    }
}
