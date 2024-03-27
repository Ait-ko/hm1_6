package com.example.task

fun main() {
    val inputArray = listOf(10, 5, 4, 6, 8, 1, 3, 9, 2)
    var smallestElement = Int.MAX_VALUE
    var largestElement = Int.MIN_VALUE

    for (item in inputArray) {
        if (item < smallestElement) smallestElement = item
        if (item > largestElement) largestElement = item
    }

    val newArray = inputArray.filter { num -> num != smallestElement && num != largestElement }

    println(newArray)
}