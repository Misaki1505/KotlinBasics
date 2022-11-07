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

    for (r in 10 downTo 0) {
        println(r)
        when(r) {
            9 -> println("Star your engines")
            6 -> println("On your marks")
            3 -> println("Get ser")
            0 -> println("GO!")
        }
    }
}