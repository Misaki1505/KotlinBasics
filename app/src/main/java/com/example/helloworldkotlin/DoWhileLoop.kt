package com.example.helloworldkotlin

fun main(args: Array<String>) {
    val puzzlePieces = 20
    var piecesPlaced = 0
    do {
        piecesPlaced++
        println("Placed piece #$piecesPlaced")
    } while (piecesPlaced < puzzlePieces)
    var finished = false
    do {
        println("please enter a number greater than 100")
        val input = readLine()?:""
        var number = input.toInt()
        if(number > 100) {
            println("Thanks")
            finished = true
        } else {
            println("$number is not greater than 100. Please try again")
        }
    } while (!finished)
}