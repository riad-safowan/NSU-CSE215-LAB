package com.riadsafowan.kotlin

import java.util.*

class Practice3 {
    //   1. Write a java program to print the factorial of a number by defining a method named 'Factorial'.
    internal object Task1 {
        @JvmStatic
        fun main(args: Array<String>) {
            val scanner = Scanner(System.`in`)
            print("Enter the number : ")
            val num = scanner.nextInt()
            println("Factorial of " + num + " is " + factorial(num))
        }

        private fun factorial(num: Int): Long {
            var factorial: Long = 1
            for (i in 1..num) {
                factorial *= i
            }
            return factorial
        }
    }

    internal object Task2 {
        //   2. Write a method named isPrime, which takes an integer as an argument and returns true
        //   if the argument is a prime number, or false otherwise.
        //   Also write main method that displays prime numbers between 1 and 500.
        @JvmStatic
        fun main(args: Array<String>) {
            for (i in 1..500) {
                if (isPrime(i)) print("$i, ")
            }
        }

        private fun isPrime(num: Int): Boolean {
            for (i in 2 until num) {
                if (num % i == 0) {
                    return false
                }
            }
            return true
        }
    }

}