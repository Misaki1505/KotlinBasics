package com.example.helloworldkotlin

fun main(args: Array<String>) {
    val animals = arrayListOf("dog", "cat", "horse", "mouse", "bee", "cow")
    for (animal in animals) {
        println("Feed the $animal")
    }

    for (i in 1..12) {
        val month = when(i)
        {
            1 -> "January"
            2 -> "February"
            3 -> "March"
            4 -> "April"
            5 -> "May"
            6 -> "June"
            7 -> "July"
            8 -> "August"
            9 -> "September"
            10 -> "October"
            11 -> "November"
            12 -> "December"
            else -> " "
        }
    }
}