package com.example.helloworldkotlin

fun main(args: Array<String>) {
    var dogName: String? =null
    dogName = "Nico"
    println(dogName?:"This dog has no name")

    println("Input a number")
    val input = readln()
    val number = input?.toInt()
    println("$number multiplied by 5 is ${number!! * 5}")
}