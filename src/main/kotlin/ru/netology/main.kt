package ru.netology

fun main() {
    val likes = 230
    val likesToString = likes.toString()
    val spelling = if (likesToString.last() == '1') "человеку" else "людям"
    println("Понравилось $likes $spelling")

}