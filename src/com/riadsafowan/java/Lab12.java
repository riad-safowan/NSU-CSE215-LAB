package com.riadsafowan.java;

public class Lab12 {
    static class Task1 {
        static abstract class Polygon {
            private int numSide;

            public Polygon(int numSide) {
                this.numSide = numSide;
            }

            public int getNumSide() {
                return numSide;
            }

            public void setNumSide(int numSide) {
                this.numSide = numSide;
            }

            public abstract double area();

            public abstract double perimeter();
        }

        static class Triangle extends Polygon {

            private double sideA;
            private double sideB;
            private double sideC;

            public Triangle(int numSide, double sideA, double sideB, double sideC) {
                super(numSide);
                this.sideA = sideA;
                this.sideB = sideB;
                this.sideC = sideC;
            }

            public double getSideA() {
                return sideA;
            }

            public void setSideA(double sideA) {
                this.sideA = sideA;
            }

            public double getSideB() {
                return sideB;
            }

            public void setSideB(double sideB) {
                this.sideB = sideB;
            }

            public double getSideC() {
                return sideC;
            }

            public void setSideC(double sideC) {
                this.sideC = sideC;
            }

            @Override
            public double area() {
                return 0;
            }

            @Override
            public double perimeter() {
                return 0;
            }
        }
    }

    static class Task2 {
        interface Discountable {
            double discountedPrice(double p);
        }

        static class BestForCustomer implements Lab11.Task2.Discountable {
            private double threshold;
            private double discount;
            private double percentage;

            public BestForCustomer(double threshold, double discount, double percentage) {
                this.threshold = threshold;
                this.discount = discount;
                this.percentage = percentage;
            }

            public double getThreshold() {
                return threshold;
            }

            public void setThreshold(double threshold) {
                this.threshold = threshold;
            }

            public double getDiscount() {
                return discount;
            }

            public void setDiscount(double discount) {
                this.discount = discount;
            }

            public double getPercentage() {
                return percentage;
            }

            public void setPercentage(double percentage) {
                this.percentage = percentage;
            }

            @Override
            public double discountedPrice(double p) {
                return threshold * (percentage / 100) - discount;
            }
        }
    }

}
