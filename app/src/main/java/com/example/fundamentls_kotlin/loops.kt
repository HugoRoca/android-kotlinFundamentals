package com.example.fundamentls_kotlin

fun main() {
    newTopic("Loops")
    showPeople("Hugo", "Marry", "Candy")
    showPeople("July", "Joel", "Alessia", "Hiro", "Don Gil", "Peter", "Diego", "Tito")
}

fun showPeople(p1: String, p2: String, p3: String) {
    println(p1)
    println(p2)
    println(p3)
}

fun showPeople(vararg people: String) {
    newTopic("Loop: For")
    for (person in people) println(person)

    newTopic("Loop While")
    var index = 0
    while (index < people.size) {
        if (people[index] == "Alessia") println("She is Alessia")
        println(people[index])
        index++
    }

    newTopic("When")
    index = (0..people.size - 1).random()
    when (people[index]){
        "Peter" -> println("He is Peter")
        "Don Gil" -> {
            println("Go to other screen")
        }
        else -> println("Not match with ${people[index]}")
    }
}