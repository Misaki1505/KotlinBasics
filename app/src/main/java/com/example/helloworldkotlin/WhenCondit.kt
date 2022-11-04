package com.example.helloworldkotlin

fun main(args: Array<String>) {
    val month = "September"
    val days = when(month) {
        "January", "March", "May", "July", "August", "October", "december"-> 31
        "February" -> 28
        else -> 30
    }
    println("The month of $month has $days days")
}