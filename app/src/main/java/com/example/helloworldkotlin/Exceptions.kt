package com.example.helloworldkotlin

import java.lang.Exception

fun main(args: Array<String>) {
    println("Pleas enter a number")
    val input = readLine()
    try {
        val number = input?.toInt()
        println("$number * 5 = ${number?.times(5)}")
        } catch (e: Exception) {
            println("The value '$input' is not a number")
        e.printStackTrace()
        }
}