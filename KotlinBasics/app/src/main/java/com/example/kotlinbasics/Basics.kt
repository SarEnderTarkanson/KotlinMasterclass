package com.example.kotlinbasics

fun main() {
var myResult = add(4,6)

println(myResult)
}

fun add (num: Int, num2: Int): Int {
    val result = num + num2
    return result
}

fun askCoffeeDetails () {
    println("Who is this coffee for?")

    var name = readln()

    println("How many pieces of sugar do you want?")

    var sugarCount = readln().toInt()

    makeCoffee(sugarCount, name)
}

fun makeCoffee(sugarCount: Int, name: String) {

    when {
        sugarCount < 0 -> println("You cannot have a negative amount of spoons of sugar.")
        sugarCount == 0 -> println("Coffee with no sugar for $name.")
        sugarCount == 1 -> println("Coffee with $sugarCount spoon of sugar for $name.")
        else -> println("Coffee with $sugarCount spoons of sugar for $name.")
    }
}
