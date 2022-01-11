package com.riadsafowan.java.finalPracticeExercise;

import java.util.GregorianCalendar;

public class Chapter9 {
    static class EX9_5 {
        public static void main(String[] args) {
            GregorianCalendar calendar = new GregorianCalendar();
            printDate(calendar);
            calendar.setTimeInMillis(1234567898765L);
            printDate(calendar);
        }

        public static void printDate(GregorianCalendar calendar) {
            System.out.println(calendar.get(GregorianCalendar.YEAR) +
                    "/" + (calendar.get(GregorianCalendar.MONTH) + 1) +
                    "/" + calendar.get(GregorianCalendar.DATE));
        }
    }

    static class EX9_8 {
        static class Fan {
            public static final int SLOW = 1;
            public static final int MEDIUM = 2;
            public static final int FAST = 3;

            private int speed = SLOW;
            private boolean on = false;
            private double radius = 5;
            private String color = "blue";

            public int getSpeed() {
                return speed;
            }

            public void setSpeed(int speed) {
                this.speed = speed;
            }

            public boolean isOn() {
                return on;
            }

            public void setOn(boolean on) {
                this.on = on;
            }

            public double getRadius() {
                return radius;
            }

            public void setRadius(double radius) {
                this.radius = radius;
            }

            public String getColor() {
                return color;
            }

            public void setColor(String color) {
                this.color = color;
            }

            public Fan() {
            }

            public String toString() {
                if (on) {
                    return "Fan speed: " + speed + " Color: " + color + " Radius: " + radius;
                } else {
                    return "Fan is off - Color: " + color + " Radius: " + radius;
                }
            }
        }

        static class Test {
            public static void main(String[] args) {
                Fan f1 = new Fan();
                Fan f2 = new Fan();

                f1.setSpeed(Fan.FAST);
                f1.setRadius(10);
                f1.setColor("yellow");
                f1.setOn(true);

                f2.setSpeed(Fan.MEDIUM);
                f2.setRadius(5);
                f2.setColor("blue");
                f2.setOn(false);

                System.out.println(f1.toString());
                System.out.println(f2.toString());
            }
        }

    }
}
