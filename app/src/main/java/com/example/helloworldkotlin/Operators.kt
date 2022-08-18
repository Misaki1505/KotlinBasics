package com.example.helloworldkotlin

fun main(args: Array<String>) {
    var bikes = 5
    bikes += 3
    println(bikes)
    bikes -= 1
    println(bikes)
    bikes *= 2
    println(bikes)
    bikes /= 2
    println(bikes)

    // Logical operators: && = And, || = Or, ! = not
    // Comparison: > = Greater than, < = Smaller than,
    // >= = Greater than or equal to, <= = Smaller than or equal to,
    // == = Equals, != = Not equals

    val Expr1 = 5.374 * 9.5847
    val Expr2 = 3.237 * 15.3726
    println("Is $Expr1 > $Expr2 : ${Expr1 > Expr2}")

    val Expr3 = ! ((3>=3) && (false || (2<5)))
    println(Expr3)
}