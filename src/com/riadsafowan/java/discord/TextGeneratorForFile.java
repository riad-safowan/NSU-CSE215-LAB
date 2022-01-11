package com.riadsafowan.java.discord;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextGeneratorForFile {
    public static void main(String[] args) {
        int length = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length: ");
        length = scanner.nextInt();

        StringBuilder string = new StringBuilder();

        for (int i = 0; i < length; i++) {
            char ch = (char) (97 + Math.random() * 26);
            string.append('*');
            if (i%100==0) string.append("\n");
        }
//        System.out.println(string);

        File myObj = new File("aboltabolfile.txt");
        try {
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }

            FileWriter myWriter = new FileWriter("aboltabolfile.txt");
            myWriter.write(String.valueOf(string));
            myWriter.close();
            System.out.println("Successfully wrote to the file.");

            System.out.println(myObj.getPath());
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }

    }
}
