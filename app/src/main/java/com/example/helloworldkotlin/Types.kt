package com.example.helloworldkotlin

//to convert a number to other type, always you can convert to a string

fun main(args: Array<String>) {
    println("Please enter a number of type double")
    val numberInput = readLine()?:""
    val number = numberInput.toDouble()
    var pi = 4.14159
    var Total = number*pi
    println(Total::class.java)
    println("The result is: $Total")

}

