package com.riadsafowan.java.labMid;

class Complex {
    private double real;
    private double imaginary;

    public Complex() {
    }

    public Complex add(Complex c) {
        return new Complex((real + c.real), (imaginary + c.imaginary));
    }

    public Complex multiply(Complex c) {
        double r1 = real * c.real;
        double i1 = real * c.imaginary;
        double r2 = imaginary * c.imaginary * -1;
        double i2 = imaginary * c.real;

        return new Complex(r1 + r2, i1 + i2);
    }

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    public String toString() {
        return real + "+" + imaginary + "i";
    }
}

public class Task3 {
    public static void main(String[] args) {
        Complex c1 = new Complex(12, 5);
        Complex c2 = new Complex(10, 6);
// add
        System.out.println(c1.toString() + " + " + c2.toString() + " = " + c1.add(c2).toString());
// multiply
        System.out.println(c1.toString() + " * " + c2.toString() + " = " + c1.multiply(c2).toString());
    }
}
