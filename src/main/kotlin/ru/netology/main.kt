package ru.netology

fun main() {
    val likes = 235

    println(spelling(likes))

}
fun spelling(likes: Int): String{
    val likesToString = likes.toString()
    val spelling = if (likesToString.last() == '1') "человеку" else "людям"
    return "Понравилось $likes $spelling"
}