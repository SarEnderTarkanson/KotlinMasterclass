package com.example.kotlinbasics

fun main(){
    var age = 0

    println("Please enter your age as a whole number: ")
    val enteredValue = readln()
    age = enteredValue.toInt()

    if (age in 18..39) {
        println("You can enter the club.")
    } else if(age >= 18){
        println("You cannot go into the club, please go home.")
    } else{
        println("Age is not verified. Please contact support.")
    }
}