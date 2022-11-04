package com.example.helloworldkotlin

fun main(args: Array<String>) {
 //   val month = "September"
 //   val days = when(month) {
 //       "January", "March", "May", "July", "August", "October", "december"-> 31
 //       "February" -> 28
 //       else -> 30
 //   }
 //   println("The month of $month has $days days")
    val input = readLine()?:"0"
    var hour = input.toInt()
    if(hour > 23) hour =23
    val timeofDay = when(hour) {
        in 6..11 -> "morning"
        in 12..14 -> "noon"
        in 15..17 -> "afternoon"
        in 18..21 -> "evening"
        else -> "night"
    }
    println("At $hour:00 it's $timeofDay")
}