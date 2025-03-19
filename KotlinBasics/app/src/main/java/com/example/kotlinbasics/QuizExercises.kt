package com.example.kotlinbasics

fun main() {
    add()
}

fun add ():Int {
    println("Please enter one number: ")
    val userInput = readln().toInt()
    println("Please enter another number: ")
    val userInput2 = readln().toInt()
    val result = userInput + userInput2
    println("The result of $userInput+$userInput2 is $result")
    return result
}

