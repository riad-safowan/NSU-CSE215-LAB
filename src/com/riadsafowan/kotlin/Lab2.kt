package com.riadsafowan.kotlin

import java.util.*

fun main() {

//  1. Write a program that takes an integer and determines if it’s odd or even. Use switch cases to produce result.
    print("\nEnter a number: ")
    val scanner = Scanner(System.`in`)
    val inputNum = scanner.nextInt()

    when (inputNum % 2) {
        0 -> println("$inputNum is an even number.")
        1 -> println("$inputNum is an odd number.")
    }

//  2. Write a program that takes an integer and determines if it’s prime or not. A number is prime if it is divisible by 1 and itself only, i.e. 2, 3, 11, 37 etc.
    var isPrime = true
    for (i in 2 until inputNum) {
        if (inputNum % i == 0) {
            isPrime = false
        }
    }
    if (isPrime) println("$inputNum is a Prime Number.") else println("$inputNum is not a Prime Number.")

//  3. Write a program that prints the multiplication table from 1 to 5.
    for (i in 1..5) {
        for (j in 1..10) {
            println("${i}x$j = ${i * j}")
        }
        println()
    }

//  4. Write a program that takes an integer and prints its divisors, i.e. divisors of 12 are 1, 2, 3, 4, 6.
    for (i in 1..inputNum) {
        if (inputNum % i == 0) {
            print("$i, ")
        }
    }

}