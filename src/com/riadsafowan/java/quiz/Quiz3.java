package com.riadsafowan.java.quiz;

class Student {
    private int stdId;
    private String stdName;

    public Student(int stdId, String stdName) {
        this.stdId = stdId;
        this.stdName = stdName;
    }

    public int getStdId() {
        return stdId;
    }

    public void setStdId(int stdId) {
        this.stdId = stdId;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public void display() {
        System.out.println("I am student");
    }
}

class Alumni extends Student {
    public Alumni(int stdId, String stdName) {
        super(stdId, stdName);
    }

    @Override
    public void display() {
        System.out.println("I am an alumni student");
    }
}

class Normal extends Student {
    public Normal(int stdId, String stdName) {
        super(stdId, stdName);
    }

    @Override
    public void display() {
        System.out.println("I am a normal student");
    }
}

public class Quiz3 {
    public static void main(String[] args) {
        Student student = new Student(1, "Riad");
        Student alumniStudent = new Alumni(2, "Safowan");
        Student normalStudent = new Normal(3, "Tanzim");

        System.out.print("Calling with the Student object: ");
        student.display();
        System.out.print("Calling with the AlumniStudent object: ");
        alumniStudent.display();
        System.out.print("Calling with the NormalStudent object: ");
        normalStudent.display();
    }
}
