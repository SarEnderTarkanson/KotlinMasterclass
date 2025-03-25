package com.example.kotlinbasics

fun main() {

    val shoppingList = listOf("Processor", "RAM", "Graphics Card", "SSD")
    val shoppingList2 = mutableListOf("Processor", "RAM", "Graphics Card", "SSD")
    println(shoppingList2)
    shoppingList2.add(0, "Keyboard")
    println(shoppingList2)
    shoppingList2.remove("SSD")
    println(shoppingList2)
    shoppingList2.removeAt(1)
    println(shoppingList2)
    shoppingList2.add(2, "Mouse")
    println(shoppingList2)
    println(shoppingList2[2])
    shoppingList2[2] = "Apple Mouse"
    println(shoppingList2)
    println(shoppingList2[2])

    val term = "RAM"

    val hasTerm = shoppingList2.contains(term)
    if (hasTerm) {
        println("Has the $term in the list")
    } else {
        println("Doesn't have the $term in the list")
    }

    for (item in 0 until shoppingList2.size) {
        println("Item ${shoppingList2[item]} is at index $item")
    }
}


/*
data class CoffeeDetails(
    val sugarCount: Int,
    val name: String,
    val size: String,
    val creamAmount: Int
)

fun askCoffeeDetails() {
    println("Who is this coffee for?")

    var name = readln()

    println("How many pieces of sugar do you want?")

    var sugarCount = readln().toInt()

    //makeCoffee(sugarCount, name)
}

fun makeCoffee(coffeeDetails: CoffeeDetails) {

    when {
        coffeeDetails.sugarCount < 0 -> println("You cannot have a negative amount of spoons of sugar.")
        coffeeDetails.sugarCount == 0 -> println("Coffee with no sugar for ${coffeeDetails.name}.")
        coffeeDetails.sugarCount == 1 -> println("Coffee with ${coffeeDetails.sugarCount} spoon of sugar for ${coffeeDetails.name}.")
        else -> println("Coffee with ${coffeeDetails.sugarCount} spoons of sugar for ${coffeeDetails.name}.")
    }
}
*/