package com.riadsafowan.java.discord;

public class Matrix {
    public static void main(String[] args) {
        double[][] m1 = {
                {1, 2, 3},
                {4, 5, 6},
                {10, 2, 7},
        };

        double[][] m2 = {
                {3, 10, 1},
                {4, 5, 6},
                {2, 2, 7},
        };

        double[][] ans = multiplyMatrix(m1, m2);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(locateLargest(m1)[0] + " " + locateLargest(m1)[1]);

        int[][] m3 = {
                {1, 2, 3},
                {4, 5, 6},
                {10, 2, 7},
        };

        int[][] m4 = {
                {3, 10, 1},
                {4, 5, 6},
                {2, 2, 7},
        };
        System.out.println(equals(m3,m4));
    }

    public static boolean equals(int[][] m1, int[][] m2) {
        int[] list1 = sortArray(m1);
        int[] list2 = sortArray(m2);

        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i])
                return false;
        }
        return true;
    }

    private static int[] sortArray(int[][] a) {
        int[] list = new int[a.length * a[0].length];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                list[index++] = a[i][j];
            }
        }

        for (int i = 0; i < list.length; i++) {
            int min = list[i];
            int minIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (min > list[j]) {
                    min = list[j];
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                list[minIndex] = list[i];
                list[i] = min;
            }
        }
        return list;
    }


    public static int[] locateLargest(double[][] a) {
        int[] index = new int[2];

        double largest = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] > largest) {
                    largest = a[i][j];
                    index[0] = i;
                    index[1] = j;
                }
            }
        }
        return index;
    }

    public static double[][] multiplyMatrix(double[][] a, double[][] b) {
        double[][] c = new double[a.length][b.length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                c[i][j] = a[i][0] * b[0][j] + a[i][1] * b[1][j] + a[i][2] * b[2][j];
            }
        }
        return c;
    }

}
