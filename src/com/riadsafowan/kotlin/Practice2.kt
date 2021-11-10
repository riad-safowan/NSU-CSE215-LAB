package com.riadsafowan.kotlin

import java.util.*

fun main() {
//   1.
    var num: Int
    val scanner = Scanner(System.`in`)
    print("Enter a number: ")
    num = scanner.nextInt()
    println("Is the number " + num + " divisible by 5? : " + isDivisibleBy5(num))

    //  2.
    print("Enter the number of chickens: ")
    val chickens: Int = scanner.nextInt()
    print("Enter the number of cows: ")
    val cows: Int = scanner.nextInt()
    print("Enter the number of pigs: ")
    val pigs: Int = scanner.nextInt()
    println("Total legs of $chickens chickens, $cows Cow and $pigs pig : " + totalLegs(chickens, cows, pigs))

    //   3.
    print("Enter a number: ")
    num = scanner.nextInt()
    println(num.toString() + " incremented by 1 : " + addOne(num))
}

//1.
fun isDivisibleBy5(num: Int): Boolean {
    return num % 5 == 0
}

//2.
fun totalLegs(chickens: Int, cows: Int, pigs: Int): Int {
    return chickens * 2 + cows * 4 + pigs * 4
}

//3.
fun addOne(num: Int): Int {
    return num + 1
}
