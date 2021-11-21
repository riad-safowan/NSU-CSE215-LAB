package com.riadsafowan.kotlin

object Lab3 {
    @JvmStatic
    fun main(args: Array<String>) {

//  1. Generate a random integer n between 5 and 20 (inclusive). Use for loop to print all integers from 0 to n separated by a space.
//     To generate a random integer between min and max range:
        val n = (5 + Math.random() * (20 - 5 + 1)).toInt()
        println("Random integer: $n")

        for (i in 1..n) {
            print("$i ")
        }
        println("\n")


//    2. Print the following
//         12345
//         1234
//         123
//         12
//         1
        for (i in 5 downTo 1) {
            for (j in 1..i) {
                print("$j ")
            }
            println()
        }
        println()


//  3. Write a program which will use while loop to print all the integers between 100 and 150 which are divisible by 8 in descending order.
        print("Output: ")
        var num = 150
        while (num >= 100) {
            if (num % 8 == 0) {
                print("$num, ")
            }
            num--
        }
        println("\n")


//  4. Generate a random int between 1990 and 2020. Then print it check if it’s a leap year or not.
        val year = (1990 + Math.random() * (2000 - 1990 + 1)).toInt()
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            println("$year: True")
        } else {
            println("$year: False")
        }
        println()


//  5. Print the following pattern:
//        *
//        +++
//        *****
//        +++++++
//        *********
        for (i in 1..5) {
            if (i % 2 == 1) {
                for (j in 1 until i * 2) {
                    print("*")
                }
                println()
            } else {
                for (j in 1 until i * 2) {
                    print("+")
                }
                println()
            }
        }
    }
}