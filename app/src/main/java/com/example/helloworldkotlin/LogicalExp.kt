package com.example.helloworldkotlin

import java.security.KeyStore

fun main(args: Array<String>) {
    val haveCat = true
    val haveCatFood = true
    if(haveCat && haveCatFood) {
        println("Cat is happy")
    } else {
        println("Oh no!")
    }
}