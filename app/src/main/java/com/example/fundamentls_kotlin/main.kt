package com.example.fundamentls_kotlin

const val separetor = "========="
fun main() {
//    print("hello kotlin")
    newTopic("a test from other func")

    newTopic("Variables and const")
//    val a = 2
    val a = true
//    a = 4, this can't modify
    println("a = $a")

//    var b = 2
    var b: Int
    b = 5
    println("b = $b")

    var objNull: String?
    objNull = null
    println(objNull)

    var anyTest: Any?
    anyTest = 3
    println(anyTest)
}

fun HaveApples(apple: Int) {
    println("Tengo $apple manzanas")
}

fun newTopic(topic: String) {
//    println(topic)
//    print(topic)

    print("$separetor $topic $separetor\n")
}