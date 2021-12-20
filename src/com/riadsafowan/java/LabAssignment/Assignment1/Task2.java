package com.riadsafowan.java.LabAssignment.Assignment1;

public class Task2 {
    static class Vehicle {
        String make = "suzuki";
        String color = "Blue";
        int wheels = 4;

        public Vehicle(String make) {
            this.make = make;
            System.out.println("Vehicle object created.");
        }

        public Vehicle(String make, String color) {
            this.make = make;
            this.color = color;
            System.out.println("Vehicle object created.");
        }

        public Vehicle(String make, String color, int wheels) {
            this.make = make;
            this.color = color;
            this.wheels = wheels;
            System.out.println("Vehicle object created.");
        }

        public String aboutMe() {
            return "  make: " + make + "\n" +
                    "  color: " + color + "\n" +
                    "  wheels: " + wheels;
        }
    }

    public static void main(String[] args) {
        int wheels = 4;
        String make = "Suzuki";
        String color = "Yellow";
        Vehicle v1 = new Vehicle(make);
        System.out.println(v1.aboutMe());
        Vehicle v2 = new Vehicle(make, color);
        System.out.println(v2.aboutMe());
        Vehicle v3 = new Vehicle(make, color, wheels);
        System.out.println(v3.aboutMe());
    }
}

