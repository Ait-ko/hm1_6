package com.example.task

fun removeLastItem(array: IntArray): IntArray {
    return array.copyOf(array.lastIndex)
}

fun main() {
    var array: IntArray = intArrayOf(5, 3, 4, 7, 6, 8, 9)
    array = removeLastItem(array)
    println(array.contentToString())
}