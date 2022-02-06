package ru.netology

fun main() {
    val likes = 235
    val result = spell(likes)
    println(result)

}
fun spell(likes: Int): String{
    val likesToString = likes.toString()
    val spelling = if (likesToString.last() == '1') "человеку" else "людям"
    return "Понравилось $likes $spelling"
}
