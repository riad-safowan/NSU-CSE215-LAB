package com.riadsafowan.kotlin

import com.riadsafowan.Utils
import java.util.*

fun main() {

//  1. Write a program that prints your name, age and department in console.
    println(
        "Name: Riad Safowan\n" +
                "Age: 21\n" +
                "Department: ECE"
    )
    Utils.drawHorizontalLine()

//  2. Write a program that prints from 1 to 10.
    for (i in 1..10) {
        println(i)
    }
    Utils.drawHorizontalLine()

// 3. Write a program that determines if an integer is odd or even.
    print("Enter a number: ")
    val scanner = Scanner(System.`in`)
    val inputNum = scanner.nextInt()

    if (inputNum % 2 == 0) {
        println("$inputNum is an even number.")
    } else {
        println("$inputNum is an odd number.")
    }
}