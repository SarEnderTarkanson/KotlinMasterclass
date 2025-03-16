package com.example.kotlinbasics

fun main() {
    makeCoffee(1, "Alpy")
    makeCoffee(0, "Alpy")
    makeCoffee(-1, "Alpy")
    makeCoffee(2, "Alpy")
}

fun makeCoffee(sugarCount: Int, name: String) {

    when {
        sugarCount < 0 -> println("You cannot have a negative amount of spoons of sugar.")
        sugarCount == 0 -> println("Coffee with no sugar for $name.")
        sugarCount == 1 -> println("Coffee with $sugarCount spoon of sugar for $name.")
        else -> println("Coffee with $sugarCount spoons of sugar for $name.")
    }
}
