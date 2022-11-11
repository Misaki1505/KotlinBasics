package com.example.helloworldkotlin

fun main(args: Array<String>) {
    println("Please enter a number")
    val input = readLine()?:""
    val number = input.toInt()
    var j = 1
    var result = 1
    while(j <= number) {
        result *= j
        j++
    }
    println("$number! = $result")
}