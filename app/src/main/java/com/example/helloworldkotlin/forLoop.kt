package com.example.helloworldkotlin

fun main(args: Array<String>) {
    val animals = arrayListOf("dog", "cat", "horse", "mouse", "bee", "cow")
    for (animal in animals) {
        println("Feed the $animal")
    }

    var total = 0
    for(i in 1..100){
        total += i
    }
    println("Total is $total")
}