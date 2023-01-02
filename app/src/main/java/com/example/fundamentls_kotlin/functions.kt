package com.example.fundamentls_kotlin

import kotlin.math.abs

fun main() {
    sayHello()
    newTopic("Args")
    val a = 2
    val b = 3
    println("$a + $b = ${sum(a, b)}")
    println("$a - $b = ${sub(a, b)}")

    newTopic("infix")
    val c = -3
    println(c.enabledAbs(false))
    println("$a + $c = ${sum(a, c.enabledAbs(true))}")

    newTopic("Sobrecarga")
    showProduct("Sobrecarga", "10%")
    showProduct("potatos")
    showProduct(name = "Jugo", exp = "12/12/2023")
}

private fun sayHello(): Unit { // Unit -> void
    println("Hello Kotlin")
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sub(a: Int, b: Int) = a - b

infix fun Int.enabledAbs(enabled: Boolean) = if (enabled) abs(this) else this

fun showProduct(name: String, offer: String = "Without prom", exp: String = "sold out") {
    println("$name = $offer to $exp")
}