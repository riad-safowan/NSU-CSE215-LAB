package com.riadsafowan.kotlin

import java.util.*

class Practice1 {
    internal object Task1 {
        //  1.Write a program to find the sum and product of all elements of an array.
        @JvmStatic
        fun main(args: Array<String>) {
            val intArray = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
            var sum = 0
            var product = 1
            for (i in intArray.indices) {
                sum += intArray[i]
            }
            for (i in intArray.indices) {
                product *= intArray[i]
            }
            println("Sum: $sum")
            println("Product: $product")
        }
    }

    internal object Task2 {
        //  2.Take 10 integer inputs from user and store them in an array.
        //  Now, copy all the elements in an another array but in reverse order.
        @JvmStatic
        fun main(args: Array<String>) {
            val array = IntArray(10)
            val reversedArray = IntArray(array.size)
            val scanner = Scanner(System.`in`)
            for (i in 0..9) {
                print("Enter a number for array element [$i]: ")
                array[i] = scanner.nextInt()
            }
            print("\nThe Array: ")
            for (i in array.indices) {
                print(array[i].toString() + ", ")
            }
            println("")
            for (i in array.indices) {
                reversedArray[i] = array[array.size - 1 - i]
            }
            print("The Array in reverse order: ")
            for (i in reversedArray.indices) {
                print(reversedArray[i].toString() + ", ")
            }
        }
    }

    internal object Task3 {
        //3.    Print the following patterns using loop :
        // a.
        // *
        // **
        // ***
        // ****
        // b.
        //   *
        //  ***
        // *****
        //  ***
        //   *
        // c.
        // 1010101
        //  10101
        //   101
        //    1
        @JvmStatic
        fun main(args: Array<String>) {
            println("a.")
            for (i in 0..3) {
                for (j in 0 until i + 1) {
                    print("*")
                }
                println()
            }
            println("b.")
            val n = 5 //n should be odd, try 201
            for (i in 0 until n) {
                if (i <= n / 2) {
                    for (j in 0 until n / 2 - i) {
                        print(" ")
                    }
                    for (j in 0 until i * 2 + 1) {
                        print("*")
                    }
                    println()
                } else {
                    for (j in 0 until i - n / 2) {
                        print(" ")
                    }
                    for (j in 0 until (n - i) * 2 - 1) {
                        print("*")
                    }
                    println()
                }
            }
            println("c.")
            for (i in 4 downTo 1) {
                for (j in 0 until 4 - i) {
                    print(" ")
                }
                for (j in 0 until i * 2 - 1) {
                    if (j % 2 == 1) print("0") else print("1")
                }
                println()
            }
        }
    }
}