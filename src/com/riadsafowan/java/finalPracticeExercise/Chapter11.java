package com.riadsafowan.java.finalPracticeExercise;

import com.riadsafowan.java.finalPracticeExercise.Chapter10.EX10_14.MyDate;

public class Chapter11 {
    static class Person {
        private String name;
        private String address;
        private String phnNumber;
        private String email;

        public Person(String name, String address, String phnNumber, String email) {
            this.name = name;
            this.address = address;
            this.phnNumber = phnNumber;
            this.email = email;
        }

        @Override
        public String toString() {
            return "Class name: Person, Person Name: " + getName();
        }

        public String getName() {
            return name;
        }

        public String getAddress() {
            return address;
        }

        public String getPhnNumber() {
            return phnNumber;
        }

        public String getEmail() {
            return email;
        }
    }

    static class Student extends Person {
        private static final int FRESHMAN = 1;
        private static final int SOPHOMORE = 2;
        private static final int JUNIOR = 3;
        private static final int SENIOR = 4;

        int classStatus;

        public Student(String name, String address, String phnNumber, String email, int classStatus) {
            super(name, address, phnNumber, email);
            this.classStatus = classStatus;
        }

        @Override
        public String toString() {
            return "Class name: Student, Person Name: " + getName();
        }
    }

    static class Employee extends Person {
        private String office;
        private String salary;
        private MyDate dateHired;

        public Employee(String name, String address, String phnNumber, String email, String office, String salary, MyDate dateHired) {
            super(name, address, phnNumber, email);
            this.office = office;
            this.salary = salary;
            this.dateHired = dateHired;
        }

        public String getOffice() {
            return office;
        }

        public String getSalary() {
            return salary;
        }

        public MyDate getDateHired() {
            return dateHired;
        }

        @Override
        public String toString() {
            return "Class name: Employee, Person Name: " + getName();
        }
    }

    static class Faculty extends Employee {
        private String officeHour;
        private int rank;

        public Faculty(String name, String address, String phnNumber, String email, String office, String salary, MyDate dateHired, String officeHour, int rank) {
            super(name, address, phnNumber, email, office, salary, dateHired);
            this.officeHour = officeHour;
            this.rank = rank;
        }

        public String getOfficeHour() {
            return officeHour;
        }

        public int getRank() {
            return rank;
        }

        @Override
        public String toString() {
            return "Class name: Faculty, Person Name: " + getName();
        }
    }

    static class Staff extends Employee {
        private String title;

        public Staff(String name, String address, String phnNumber, String email, String office, String salary, MyDate dateHired, String title) {
            super(name, address, phnNumber, email, office, salary, dateHired);
            this.title = title;
        }

        public String getTitle() {
            return title;
        }

        @Override
        public String toString() {
            return "Class name: Staff, Person Name: " + getName();
        }
    }

    public static void main(String[] args) {
        Person person = new Person("Riad", "dhaka", "1324134", "asdf@lkdjfa.com");
        Student student = new Student("Safowam", "dhaka", "1324134", "asdf@lkdjfa.com", Student.SENIOR);
        Employee employee = new Employee("Redwan", "dhaka", "1324134", "asdf@lkdjfa.com", "alsdkfj", "1234", new MyDate());
        Faculty faculty = new Faculty("Rahil", "dhaka", "1324134", "asdf@lkdjfa.com", "alsdkfj", "1234", new MyDate(), "12:00", 5);
        Staff staff = new Staff("Tanvir", "dhaka", "1324134", "asdf@lkdjfa.com", "alsdkfj", "1234", new MyDate(), "haha");

        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
    }
}
