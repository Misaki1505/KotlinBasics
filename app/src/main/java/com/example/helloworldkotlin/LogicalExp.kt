package com.example.helloworldkotlin


fun main(args: Array<String>) {
    val haveCat = true
    val haveCatFood = true
    if(haveCat && haveCatFood) {
        println("Cat is happy")
    } else {
        println("Oh no!")
    }

    val animals = arrayListOf<String>()
    if (animals.isEmpty()) {
        animals.add("dog")
    }
}