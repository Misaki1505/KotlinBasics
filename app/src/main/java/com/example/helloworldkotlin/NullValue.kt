package com.example.helloworldkotlin

// I have to use "?" after the type to give a null value.

fun main(args: Array<String>) {
    var fishName: String? = "Pez"
    fishName = null
    println(fishName)

    //Nullable operators

    var nameCat: String? = "Satanás"
    println(nameCat?.length)
    nameCat = null
    println(nameCat?.length)

    val a: Int? = 10
    println(a?.plus(3))
    println(a?.minus(3))
    println(a?.times(3))
    println(a?.div(3))
    println(a?.rem(3))

}