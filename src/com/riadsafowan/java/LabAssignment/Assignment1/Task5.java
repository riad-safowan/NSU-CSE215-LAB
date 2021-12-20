package com.riadsafowan.java.LabAssignment.Assignment1;

import java.util.Scanner;

class Courier {
    private int courierId;
    private String nameOfCourier;

    public Courier() {
    }

    public Courier(int courierId, String nameOfCourier) {
        this.courierId = courierId;
        this.nameOfCourier = nameOfCourier;
    }

    public int getCourierId() {
        return courierId;
    }

    public void setCourierId(int courierId) {
        this.courierId = courierId;
    }

    public String getNameOfCourier() {
        return nameOfCourier;
    }

    public void setNameOfCourier(String nameOfCourier) {
        this.nameOfCourier = nameOfCourier;
    }

    public void printShipment(double baseFair) {
        System.out.println("Courier ID: " + courierId + "\n" +
                "Name Of Courier: " + nameOfCourier + "\n" +
                "Shipping Charge: " + (baseFair + 20));
    }
}

class International_Services extends Courier {
    private String destination;
    private int numberOfParcel;

    public International_Services() {
    }

    public International_Services(int courierId, String nameOfCourier, String destination, int numberOfParcel) {
        super(courierId, nameOfCourier);
        this.destination = destination;
        this.numberOfParcel = numberOfParcel;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getNumberOfParcel() {
        return numberOfParcel;
    }

    public void setNumberOfParcel(int numberOfParcel) {
        this.numberOfParcel = numberOfParcel;
    }

    @Override
    public void printShipment(double baseFair) {
        System.out.println("Destination: " + destination + "\n" +
                "Number of Parcels: " + numberOfParcel + "\n" +
                "Shipping Charge: " + baseFair * numberOfParcel + "\n" +
                "Message: " + (baseFair * numberOfParcel > 100 ? "More Sale" : "Less Sale"));
    }
}

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Courier ID: ");
        int courierId = scanner.nextInt();
        System.out.print("Enter the Courier Name: ");
        String name = scanner.next();
        System.out.print("Enter the Base fair: ");
        int baseFair = scanner.nextInt();
        Courier courier = new Courier(courierId, name);
        courier.printShipment(baseFair);
        System.out.println();

        System.out.print("Enter the Destination: ");
        String destination = scanner.next();
        System.out.print("Enter the number of Parcels: ");
        int numberOfParcels = scanner.nextInt();
        System.out.print("Enter the Base fair: ");
        int baseFair2 = scanner.nextInt();
        International_Services services = new International_Services();
        services.setDestination(destination);
        services.setNumberOfParcel(numberOfParcels);
        services.printShipment(baseFair2);
    }
}