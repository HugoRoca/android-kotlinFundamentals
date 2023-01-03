package com.example.fundamentls_kotlin

import com.example.fundamentls_kotlin.classes.Group
import com.example.fundamentls_kotlin.classes.User

fun main() {
    newTopic("Collections")
    newTopic("readonly")
    val fruits = listOf<String>("apple", "banana", "pineapple", "cherry")

    println(fruits.get((0..fruits.size - 1).random()))
    println("index of cherry is: ${fruits.indexOf("cherry")}")

    newTopic("Mutable list")
    val myUser = User(1, "Hugo", "Roca", Group.WORK.ordinal)
    val bro = myUser.copy(2, "Candy")
    val friend = bro.copy(3, group= Group.FRIEND.ordinal)

    val usersList = mutableListOf<User>(myUser, bro)

    usersList.add(friend)
    println(usersList)

//    usersList.removeAt(2)
    usersList.remove(bro)
    println(usersList)

    var userSelectList = mutableListOf<User>()
    println(userSelectList)
    userSelectList.addAll(usersList)
    println(userSelectList)

    newTopic("Map")
    val usersMap = mutableMapOf<Int, User>()
    println(usersMap)
    usersMap.put(myUser.id.toInt(), myUser)
    usersMap.put(friend.id.toInt(), myUser)
    println(usersMap)
    usersMap.put(bro.id.toInt(), friend)
    println(usersMap)
    println(usersMap.keys)
    println(usersMap.values)
}