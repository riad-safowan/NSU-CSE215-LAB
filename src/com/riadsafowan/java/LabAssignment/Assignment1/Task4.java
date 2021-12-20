package com.riadsafowan.java.LabAssignment.Assignment1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter the number of pets: ");
        int number = scanner.nextInt();
        System.out.print("Enter all pets separated by a space: ");
        String[] pets = new String[number];
        for (int i = 0; i < number; i++) {
            pets[i] = scanner.next();
        }
        System.out.print("Enter the favorite one: ");
        String pet = scanner.next();
        Person person = new Person(name, pet, pets);
        System.out.println("This person is : "+person.happy());
    }
}

class Person {
    String name;
    String favoritePet;
    String[] listOfPets;

    public Person(String name, String favoritePet, String[] pets) {
        this.name = name;
        this.favoritePet = favoritePet;
        this.listOfPets = pets;
    }

    public boolean happy() {
        int number = 0;
        for (String p : listOfPets) if (p.equals(favoritePet)) number++;
        return number > listOfPets.length * (1.0 / 2);
    }
}

