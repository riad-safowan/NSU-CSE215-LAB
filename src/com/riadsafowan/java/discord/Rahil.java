package com.riadsafowan.java.discord;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

class Time {
    public static void main(String[] args) {

        Thread th = new Thread(new Runnable() {
            public void run() {
                int i = 60;
                while (i >= 0) {
                    Date date = Calendar.getInstance().getTime();
                    DateFormat formatter = new SimpleDateFormat("EEEE, dd MMMM yyyy, hh:mm:ss a");
                    String today = formatter.format(date);

                    System.out.print("Today : " + today + "\r");
                    if (i == 60) {
                        System.out.println("Exam ends at: " + formatter.format(date.getTime() + 1000 * 60));

                    }

                    try {
                        Thread.sleep(1000);
                        i--;
                    } catch (Exception ignored) {
                    }
                }
            }


        });
        th.start();
        startExam();
    }

    private static void startExam() {
        System.out.println("exam started...");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.println("Inputed number is " + i);
    }
}
