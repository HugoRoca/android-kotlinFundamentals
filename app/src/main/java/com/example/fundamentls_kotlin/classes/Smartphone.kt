package com.example.fundamentls_kotlin.classes

class Smartphone(number: Int, val isPrivate: Boolean): Phone(number) {
    override fun showNumber() {
        if (isPrivate) println("unknown number")
    }
}