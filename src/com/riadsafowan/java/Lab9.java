package com.riadsafowan.java;

public class Lab9 {
    static class Task1 {
        static class Person {
            private String name;
            private String gender;
            private int age;

            public Person(String name, String gender, int age) {
                this.name = name;
                this.gender = gender;
                this.age = age;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getGender() {
                return gender;
            }

            public void setGender(String gender) {
                this.gender = gender;
            }

            public int getAge() {
                return age;
            }

            public void setAge(int age) {
                this.age = age;
            }
        }

        static class Employee extends Person {
            private String id;
            private String department;
            private double salary;

            public Employee(String name, String gender, int age, String id, String department, double salary) {
                super(name, gender, age);
                this.id = id;
                this.department = department;
                this.salary = salary;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getDepartment() {
                return department;
            }

            public void setDepartment(String department) {
                this.department = department;
            }

            public double getSalary() {
                return salary;
            }

            public void setSalary(double salary) {
                this.salary = salary;
            }
        }

        static class Faculty extends Employee {
            private String initial;
            private String rank;

            public Faculty(String name, String gender, int age, String id, String department, double salary, String initial, String rank) {
                super(name, gender, age, id, department, salary);
                this.initial = initial;
                this.rank = rank;
            }

            public String getInitial() {
                return initial;
            }

            public void setInitial(String initial) {
                this.initial = initial;
            }

            public String getRank() {
                return rank;
            }

            public void setRank(String rank) {
                this.rank = rank;
            }

            @Override
            public String toString() {
                return "Faculty{" +
                        "name='" + getName() + '\'' +
                        "age='" + getAge() + '\'' +
                        "salary='" + getSalary() + '\'' +
                        "initial='" + initial + '\'' +
                        '}';
            }
        }

        public static void main(String[] args) {
            Faculty faculty = new Faculty("asdf jlk", "male", 35, "2k3jh432h", "ECE", 115000, "AJK", "A");

            System.out.println(faculty.toString());
        }
    }

    static class Task2 {
        static class Person {
            private String name;
            private int age;
            private String address;

            public Person(String name, int age, String address) {
                this.name = name;
                this.age = age;
                this.address = address;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getAge() {
                return age;
            }

            public void setAge(int age) {
                this.age = age;
            }

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
            }
        }

        static class Employee extends Person {
            private String department;
            private String designation;

            public Employee(String name, int age, String address, String department, String designation) {
                super(name, age, address);
                this.department = department;
                this.designation = designation;
            }

            public String getDepartment() {
                return department;
            }

            public void setDepartment(String department) {
                this.department = department;
            }

            public String getDesignation() {
                return designation;
            }

            public void setDesignation(String designation) {
                this.designation = designation;
            }
        }

        static class PartTimeEmployee extends Employee {
            private double hours;
            private double rate;

            public PartTimeEmployee(String name, int age, String address, String department, String designation, double hours, double rate) {
                super(name, age, address, department, designation);
                this.hours = hours;
                this.rate = rate;
            }

            public double getHours() {
                return hours;
            }

            public void setHours(double hours) {
                this.hours = hours;
            }

            public double getRate() {
                return rate;
            }

            public void setRate(double rate) {
                this.rate = rate;
            }

            @Override
            public String toString() {
                return "PartTimeEmployee{" +
                        "hours=" + hours +
                        ", rate=" + rate +
                        '}';
            }

            public double salary() {
                return hours * rate * 24 * 7;
            }
        }

        static class FullTimeEmployee extends Employee {
            private double basic;
            private double allowance;

            public FullTimeEmployee(String name, int age, String address, String department, String designation, double basic, double allowance) {
                super(name, age, address, department, designation);
                this.basic = basic;
                this.allowance = allowance;
            }

            public double getBasic() {
                return basic;
            }

            public void setBasic(double basic) {
                this.basic = basic;
            }

            public double getAllowance() {
                return allowance;
            }

            public void setAllowance(double allowance) {
                this.allowance = allowance;
            }

            @Override
            public String toString() {
                return "FullTimeEmployee{" +
                        "basic=" + basic +
                        ", allowance=" + allowance +
                        '}';
            }

            public double salary() {
                return basic + (25 * basic / 100);
            }
        }

        public static void main(String[] args) {
            PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Riad", 21, "Dhaka", "Engineer", "AAA", 4, 40);
            FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Safowan", 21, "Dhaka", "Engineer", "AAA", 15000, 25);

            System.out.println("Part time employee salary: " + partTimeEmployee.salary());
            System.out.println("Full time employee salary: " + fullTimeEmployee.salary());
        }
    }

}