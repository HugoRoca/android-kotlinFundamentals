package com.example.fundamentls_kotlin.classes

import com.example.fundamentls_kotlin.newTopic

fun main(){
    newTopic("Classes")
    val phone: Phone = Phone(999111123)
    phone.call()
    phone.showNumber()
//    println(phone.number)

    newTopic("Inherits")
    val smartphone = Smartphone(987654321, true)
    smartphone.call()

    newTopic("override")
    smartphone.showNumber()
    println("private? ${smartphone.isPrivate}")

    newTopic("Data classes")
    val myUser = User(1, "Hugo", "Roca", Group.WORK.ordinal)
    val bro = myUser.copy(2, "Candy")
    val friend = bro.copy(3, group=Group.FRIEND.ordinal)

    println(myUser.component2())
    println(myUser)
    println(bro)
    println(friend)

    newTopic("Funciones de alcance")
    with(smartphone) {
        println("is private? $isPrivate")
        call()
    }

    friend.group = Group.WORK.ordinal
    friend.name = "Capitan"
    friend.apply {
        group = Group.FAMILY.ordinal
        name = "Maura"
        lastName = "Michina"
    }

    println(friend)
}