package com.example.kotlinbasics

fun main() {
    println("Please enter a number: ")
    val inputString = readln()

    try {
        val inputNumber = inputString.toInt()
        val multiplier = 5
        val result = inputNumber * multiplier
        println("Result of operation is: $result")
    } catch (e: NumberFormatException) {
        println("Invalid number format. Please enter a valid integer.")
    }
}