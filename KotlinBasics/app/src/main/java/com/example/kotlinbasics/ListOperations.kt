package com.example.kotlinbasics

fun main() {
    val fruitList = mutableListOf("Apple", "Banana", "Grapes", "Water Melon")
    println(fruitList)
    fruitList.add("Peach")
    println(fruitList)
    fruitList.remove("Water Melon")
    println(fruitList)
    val fruit = "Peach"
    val hasFruit = fruitList.contains(fruit)

    if (hasFruit) {
        println("The list contains the fruit $fruit")
    } else {
        println("The list doesn't contain the fruit $fruit")
    }
}