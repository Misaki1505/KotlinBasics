package com.example.helloworldkotlin

fun main(args: Array<String>) {
    for (i in 1..5){
        for(j in 1..5){
          print("$i, $j \t")
        }
        println()
    }

    val matrixSize = 10
    for(i in 0..matrixSize){
        for (j in 0..matrixSize){
            if(i==j) {
                print("diagonal\t")
            } else {
                print("$i,$j \t\t")
            }
        }
        println()
    }

    for(i in 1..10) {
        for(j in 1..i) {
            print("\uD83D\uDE31")
        }
        println()
    }
}