package com.riadsafowan.kotlin

import java.util.*

object Lab4 {
    @JvmStatic
    fun main(args: Array<String>) {

        //  1. Declare an integer array of size 6, initialize it with user input, calculate and print the average.
        //     Now calculate the percentage of numbers that are above that average.For example: if 3 of the array elements
        //     are greater than average, percentage is: 3 * 100 / 6 = 50%
        val ints = IntArray(6)
        val scanner = Scanner(System.`in`)
        for (i in ints.indices) {
            print("Input integer $i :")
            ints[i] = scanner.nextInt()
        }
        var total = 0
        for (i in ints.indices) {
            total += ints[i]
        }
        val avg = total / ints.size
        println("Average = $avg")
        var aboveAvg = 0
        for (i in ints.indices) {
            if (ints[i] > avg) {
                aboveAvg++
            }
        }
        val pAbvAvg = aboveAvg * 100 / ints.size
        println("There are $pAbvAvg% of numbers above average")

        //  2. Take an integer from user, generate that many fibonacci numbers and store in an array. Display the array.
        print("Enter a number for fibonacci :")
        val num = scanner.nextInt()
        val array = IntArray(num)
        for (i in 0 until num) {
            if (i == 0) {
                array[i] = 0
            } else if (i == 1) {
                array[i] = 1
            } else {
                array[i] = array[i - 1] + array[i - 2]
            }
        }
        for (i in array.indices) {
            print(array[i].toString() + " ")
        }
        println()
        //Take a 3X3 array and initialize it with these values:
        // 3 4 9
        // 2 9 11
        // 4 6 0
        // Calculate and print the sum for each row, column and both diagonals.

        val rows: Int
        val cols: Int
        var sumRow: Int
        var sumCol: Int
        var sumD = 0
        val a = arrayOf(intArrayOf(3, 4, 9), intArrayOf(2, 9, 11), intArrayOf(4, 6, 0))
        rows = a.size
        cols = a[0].size
        for (i in 0 until rows) {
            sumRow = 0
            for (j in 0 until cols) {
                sumRow += a[i][j]
            }
            println("Sum of row $i = $sumRow")
        }
        println()
        for (i in 0 until cols) {
            sumCol = 0
            for (j in 0 until rows) {
                sumCol += a[j][i]
            }
            println("Sum of column $i = $sumCol")
        }
        println()
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                if (i == j) sumD += a[i][j]
            }
        }
        println(sumD)
        sumD = 0
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                if (i + j == a.size - 1) sumD += a[i][j]
            }
        }
        println(sumD)

        //  4. Take an integer array and print only the numbers that are in consecutive orders of 3.
        val array4 = intArrayOf(1, 2, 3, 2, 2, 2, 1, 1, 4, 4, 4, 3, 3)
        print("Outputs :")
        for (i in 0 until array4.size - 3) {
            if (array4[i] == array4[i + 1] && array4[i + 1] == array4[i + 2]) {
                print(array4[i].toString() + " ")
            }
        }
    }
}