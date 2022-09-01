package com.example.helloworldkotlin

fun main(args: Array<String>) {
    var colors = arrayListOf("blue", "red", "purple")
    println(colors)
    colors.add("Yellow")
    println(colors)
    val moreColors = arrayListOf("pink", "black", "white")
    colors.addAll(moreColors)
    println(colors)

    colors.remove("red")
    println(colors)

    colors.removeAt(1)
    println(colors)
}