package com.riadsafowan.java.discord;

import java.security.SecureRandom;

public class array {

    public static void print(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        int[] a = {2, 2, 2, 2, 1, 6, 3, 4, 5, 2};
        int[] ans = eliminateDuplicates(a);

//        for (int i = 0; i < ans.length; i++) {
//            print(ans[i] + ", ");
//        }

        System.out.println(isConsecutiveFour(a));
    }

    public static boolean isConsecutiveFour(int[] values) {
        for (int i = 0; i < values.length - 4; i++) {
            if (values[i] == values[i + 1] && values[i + 1] == values[i + 2] && values[i + 2] == values[i + 3]) {
                return true;
            }
        }
        return false;
    }

    public static int[] eliminateDuplicates(int[] list) {
        int[] a = new int[list.length];
        int index = 0;
        for (int i = 0; i < list.length; i++) {

            boolean doesExist = false;

            for (int j = 0; j < a.length; j++) {
                if (a[j] == list[i]) {
                    doesExist = true;
                    break;
                }
            }

            if (!doesExist) {
                a[index++] = list[i];
            }
        }

        return a;
    }
}
