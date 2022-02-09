package ru.netology

fun main() {
    val likes = 1
    val result = spell(likes)
    println(result)

}
fun spell(likes: Int): String{
    val spelling = if ((likes % 10 == 1) && (likes !=11) && (likes % 100 != 11)) "человеку" else "людям"
    return "Понравилось $likes $spelling"
}
