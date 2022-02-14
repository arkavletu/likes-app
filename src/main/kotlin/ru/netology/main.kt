package ru.netology

fun main() {
    val likes = 111
    val result = spell(likes)
    println(result)

}
fun spell(likes: Int): String{
    val spelling = if (likes % 100 != 11) "человеку" else "людям"
    return "Понравилось $likes $spelling"
}
