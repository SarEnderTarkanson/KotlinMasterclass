package com.example.kotlinbasics

fun main() {
makeCoffee(-1)
}

fun makeCoffee(sugarCount:Int){
    if (sugarCount ==1){
        println("Coffee with $sugarCount spoon of sugar")
    } else if (sugarCount < 0){
        println("You cannot have negative amount of spoons of sugar")
    }
    else {
        println("Coffee with $sugarCount spoons of sugar")
    }
}