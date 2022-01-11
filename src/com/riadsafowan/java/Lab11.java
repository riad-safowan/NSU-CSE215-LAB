package com.riadsafowan.java;

public class Lab11 {
    static class Task1 {
        abstract static class Shape {
            private String name;

            public Shape(String name) {
                this.name = name;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public abstract double area();

            public abstract double perimeter();
        }

        static class Rectangle extends Shape {
            private double length;
            private double width;

            public Rectangle(String name, double length, double width) {
                super(name);
                this.length = length;
                this.width = width;
            }

            public double getLength() {
                return length;
            }

            public void setLength(double length) {
                this.length = length;
            }

            public double getWidth() {
                return width;
            }

            public void setWidth(double width) {
                this.width = width;
            }

            @Override
            public double area() {
                return length * width;
            }

            @Override
            public double perimeter() {
                return 2 * (length + width);
            }
        }

        public static void main(String[] args) {
            Shape s = new Rectangle("s", 123, 123);
            System.out.println("Area: " + s.area());
            System.out.println("Perimeter: " + s.perimeter());
        }
    }

    static class Task2 {
        interface Discountable {
            double discountedPrice(double p);
        }

        static class PercentageDiscount implements Discountable {
            private double percentage;

            public PercentageDiscount(double percentage) {
                this.percentage = percentage;
            }

            public double getPercentage() {
                return percentage;
            }

            public void setPercentage(double percentage) {
                this.percentage = percentage;
            }

            @Override
            public double discountedPrice(double p) {
                return 0;
            }
        }

        static class ThresholdDiscount implements Discountable {
            private double threshold;
            private double discount;

            public ThresholdDiscount(double threshold, double discount) {
                this.threshold = threshold;
                this.discount = discount;
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

            @Override
            public double discountedPrice(double p) {
                return threshold - discount;
            }
        }
    }
}
