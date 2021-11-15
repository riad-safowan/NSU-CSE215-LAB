package com.riadsafowan.kotlin

import com.riadsafowan.java.Lab5
import java.util.*

class Lab5 {
    internal object Task1 {
        //  1. Write a method countVowels(String arg) that takes a String as parameter and returns the number of vowels.
        @JvmStatic
        fun main(args: Array<String>) {
            val scanner = Scanner(System.`in`)
            print("Enter a String to count it's vowels : ")
            val text = scanner.next()
            println("The string has " + countVowels(text) + " vowels")
        }

        private fun countVowels(arg: String): Int {
            var count = 0
            for (i in arg.indices) {
                when (arg.get(i)) {
                    'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u' -> count++
                }
            }
            return count
        }
    }

    internal object Task2 {
        //   2. Write a method isPalindrome(String arg) that determines if a String is palindrome or not.
        //   Palindrome is when a String remains the same after reversing. The method should return boolean type.
        //   For example: MADAM is palindrome.

        @JvmStatic
        fun main(args: Array<String>) {
            val scanner = Scanner(System.`in`)
            print("Enter a String to check if it is a palindrome : ")
            val text = scanner.next()
            if (isPalindrome(text)) println("$text is a Palindrome") else println("$text is not a Palindrome")
        }

        private fun isPalindrome(arg: String): Boolean {
            var isPalindrome = true
            for (i in arg.indices) {
                if (arg[i] != arg[arg.length - 1 - i]) {
                    isPalindrome = false
                    break
                }
            }
            return isPalindrome
        }
    }

    internal object Task3 {

        //   3. Write a program that has the following static variable - balance (initial value 0) and these static methods:
        //   deposit(double amount): Increase account balance
        //   withdraw(double amount): Decrease account balance
        //   Now run an infinite loop in main program so it displays user with following options:
        //   1.   Deposit
        //   2.   Withdraw
        //   3.   Balance
        //   4.   Exit
        //   Under each option, the program should ask for appropriate user input (i.e. amount to deposit).
        private var balance = 0.0

        @JvmStatic
        fun main(args: Array<String>) {
            val scanner = Scanner(System.`in`)
            var menu: Int
            do {
                println("1.   Deposit")
                println("2.   Withdraw")
                println("3.   Balance")
                println("4.   Exit")

                print("select an option: ")
                menu = scanner.nextInt()
                when (menu) {
                    1 -> {
                        print("Enter the amount of deposit: ")
                        deposit(scanner.nextDouble())
                        balance()
                    }
                    2 -> {
                        print("Enter the amount of withdraw: ")
                        withdraw(scanner.nextDouble())
                        balance()
                    }
                    3 -> balance()
                }
            } while (menu != 4)
        }

        private fun deposit(amount: Double) {
            balance += amount
        }

        private fun withdraw(amount: Double) {
            balance -= amount
        }

        private fun balance() {
            println("Current Balance $balance")
        }
    }
}