package com.example.kotlinbasics

class BookClass(
    val title: String = "Unknown",
    val author: String = "Anonymous",
    val yearPublished: Int = 2025
)

fun main() {
    val myBook = BookClass()
    println(myBook.title)
    println(myBook.author)
    println(myBook.yearPublished)

    val customBook = BookClass("Count of Monte Cristo", "Alexandre Dumas", 1820)
    println(customBook.title)
    println(customBook.author)
    println(customBook.yearPublished)

}
