package com.example.helloworldkotlin

fun main(args: Array<String>) {
//I'm learning how to do an app in Kotlin
    println("Welcome Again to Kotlin, Pao!")

     //var is variable
    var Knowledge = "Learn"
    println(Knowledge)

    // val is inmutable, you can't change the value in other line
    val catName = "My cat's name is \"Fluffy\""
    println(catName)

    var line1 = "(\\ (\\"
    var line2 = "(-.-)"
    var line3 = "o_(\")(\")"
    println(line1)
    println(line2)
    println(line3)

    val myPet = "Nicolas"
    val myName = "paula"
    val myAnimal = "Shark"

    println(myPet.length)
    println(myPet.get(3))
    println(myPet[3])
    println(myPet.substring(3))
    println(myPet.substring(3,5))

    println(myPet.chunked(2))

    println("My dog's name is $myPet")

    val apples = 3
    val oranges = 6
    println("The total number of fruit is ${apples + oranges}")

    val client = "Mary"
    val products = 3
    val price = 30

    println("The client $client has to pay ${products * price} dollars")
}