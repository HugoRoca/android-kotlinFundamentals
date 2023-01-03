package com.example.fundamentls_kotlin.classes

open class Phone (protected val number: Int){
    fun call() {
        println("calling...")
    }

    open fun showNumber() {
        println("My number is $number")
    }
}