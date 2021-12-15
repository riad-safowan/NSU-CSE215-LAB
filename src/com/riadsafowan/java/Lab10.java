package com.riadsafowan.java;

import java.util.Scanner;

public class Lab10 {
    static class Plant {
        private String name;
        private String color;

        public Plant(String name, String color) {
            this.name = name;
            this.color = color;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        @Override
        public String toString() {
            return "Plant{" +
                    "name='" + name + '\'' +
                    ", color='" + color + '\'' +
                    '}';
        }
    }

    static class Flower extends Plant {
        private boolean hasSmell;
        private boolean hasThorn;

        public Flower(String name, String color, boolean hasSmell, boolean hasThorn) {
            super(name, color);
            this.hasSmell = hasSmell;
            this.hasThorn = hasThorn;
        }

        public boolean isHasSmell() {
            return hasSmell;
        }

        public void setHasSmell(boolean hasSmell) {
            this.hasSmell = hasSmell;
        }

        public boolean isHasThorn() {
            return hasThorn;
        }

        public void setHasThorn(boolean hasThorn) {
            this.hasThorn = hasThorn;
        }

        @Override
        public String toString() {
            return "Flower{" +
                    "name='" + getName() + '\'' +
                    ", color='" + getColor() + '\'' +
                    ", hasSmell=" + hasSmell +
                    ", hasThorn=" + hasThorn +
                    '}';
        }
    }

    static class Herb extends Plant {
        private boolean isMedicinal;
        private String season;

        public Herb(String name, String color, boolean isMedicinal, String season) {
            super(name, color);
            this.isMedicinal = isMedicinal;
            this.season = season;
        }

        public boolean isMedicinal() {
            return isMedicinal;
        }

        public void setMedicinal(boolean medicinal) {
            isMedicinal = medicinal;
        }

        public String getSeason() {
            return season;
        }

        public void setSeason(String season) {
            this.season = season;
        }

        @Override
        public String toString() {
            return "Herb{" +
                    "name='" + getName() + '\'' +
                    ", color='" + getColor() + '\'' +
                    ", isMedicinal=" + isMedicinal +
                    ", season='" + season + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        Plant[] plants = new Plant[10];
        do {
            System.out.println("Select an option: ");
            System.out.println("1 -> Add a plant");
            System.out.println("2 -> Remove a plant");
            System.out.println("3 -> Search a plant");
            System.out.println("4 -> Display a plant");
            System.out.println("0 -> close");
            System.out.print("Choose: ");
            option = scanner.nextInt();
            switch (option) {
                case 1 -> {
                    System.out.print("Enter Name: ");
                    String name = scanner.next();
                    System.out.print("Enter Color: ");
                    String color = scanner.next();
                    add(plants, new Plant(name, color));
                }
                case 2 -> {
                    System.out.print("Enter Name: ");
                    String name = scanner.next();
                    remove(plants, name);
                }
                case 3 -> {
                    System.out.print("Enter Name: ");
                    String name = scanner.next();
                    System.out.println(search(plants, name).toString());
                }
                case 4 -> {
                    display(plants);
                }
                default -> {
                }
            }
        } while (option != 0);

    }

    static void add(Plant[] plants, Plant p) {
        for (int i = 0; i < plants.length; i++) {
            if (plants[i] == null) {
                plants[i] = p;
                return;
            }
        }
    }

    static void remove(Plant[] plants, String n) {
        for (int i = 0; i < plants.length; i++) {
            if (plants[i] != null && plants[i].name.equals(n)) plants[i] = null;
        }
    }

    static Plant search(Plant[] plants, String n) {
        Plant p = new Plant("", "");
        for (Plant plant : plants) {
            if (plant.name.equals(n)) return plant;
        }
        return p;
    }

    static void display(Plant[] plants) {
        for (Plant plant : plants) {
            if (plant != null) System.out.println(plant.toString());
        }
    }
}
