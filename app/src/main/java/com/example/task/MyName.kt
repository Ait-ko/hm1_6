package com.example.task

//Придумайте 10 разных имен, и по буквам соберите свое имя
fun main() {
    val arrayNames: Array<String> =
        arrayOf("Али", "Адилет", "Алтынай", "Чынгыз", "Султан", "Кума", "Аман", "Винчестр", "Дин", "Сэм")

    val nameToSpell = ""
    val assembledName = StringBuilder()

    for (char in nameToSpell) {
        for (name in arrayNames) {
            if (name.contains(char, ignoreCase = true)) {
                assembledName.append(char)
                break
            }
        }
    }
    println("Собранное имя: $assembledName")
}