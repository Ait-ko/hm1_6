package com.example.task

fun main() {
    val arrayNames: Array<String> =
        arrayOf("Али", "Адилет", "Алтынай", "Чынгыз", "Султан", "Кума", "Аман", "Генри", "Дин", "Сэм")

    val nameToSpell = "ААААААААААААААААААААААааъъъ"
    val assembledName = StringBuilder()

    for (char in nameToSpell) {
        for (name in arrayNames) {
            if (name.contains(char)) {
                assembledName.append(char)
                break
            }
        }
    }

    println("Собранное имя: $assembledName")
}