package com.riadsafowan.java;

import java.util.Scanner;

class Task1 {
    static class Book {
        int isbn;
        String title;
        String author;
        double price;
    }

    static class EBook extends Book {
        String downloadUrl;
        double sizeMB;

        @Override
        public String toString() {
            return "EBook{" +
                    "isbn=" + isbn +
                    ", title='" + title + '\'' +
                    ", author='" + author + '\'' +
                    ", price=" + price +
                    ", downloadUrl='" + downloadUrl + '\'' +
                    ", sizeMB=" + sizeMB +
                    '}';
        }
    }

    static class PaperBook extends Book {
        double shippingWeight;
        boolean inStock;

        @Override
        public String toString() {
            return "PaperBook{" +
                    "isbn=" + isbn +
                    ", title='" + title + '\'' +
                    ", author='" + author + '\'' +
                    ", price=" + price +
                    ", shippingWeight=" + shippingWeight +
                    ", inStock=" + inStock +
                    '}';
        }
    }

    static public class Test {
        public static void main(String[] args) {
            EBook eBook = new EBook();
            eBook.isbn = 87687987;
            eBook.title = "intro to java";
            eBook.author = "Mirza Abir";
            eBook.price = 50.5;
            eBook.downloadUrl = "http://mirzaabir.org/book/87687987";
            eBook.sizeMB = 2.3;

            System.out.println(eBook.toString());

            PaperBook paperBook = new PaperBook();
            paperBook.isbn = 87793487;
            paperBook.title = "intro to java";
            paperBook.author = "Mirza Abir";
            paperBook.price = 500.5;
            paperBook.shippingWeight = 1200;
            paperBook.inStock = true;

            System.out.println(paperBook.toString());
        }
    }

}

class Task2 {
    static class Shape {
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
    }

    static class Rectangle extends Shape {
        private double side1;
        private double side2;

        public Rectangle(String name, double side1, double side2) {
            super(name);
            this.side1 = side1;
            this.side2 = side2;
        }

        public double getSide1() {
            return side1;
        }

        public void setSide1(double side1) {
            this.side1 = side1;
        }

        public double getSide2() {
            return side2;
        }

        public void setSide2(double side2) {
            this.side2 = side2;
        }

        public double area() {
            return side1 * side2;
        }

        public double perimeter() {
            return 2 * (side1 + side2);
        }
    }

    static class Square extends Rectangle {
        public Square(String name, double side1) {
            super(name, side1, side1);
        }
    }

    public static class Test {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the name: ");
            String name = scanner.nextLine();
            System.out.print("Enter the side of the square: ");
            double side = scanner.nextDouble();

            Square square = new Square(name, side);
            System.out.println("area of " + square.getName() + " is " + square.area());
            System.out.println("perimeter of " + square.getName() + " is " + square.perimeter());
        }
    }
}








