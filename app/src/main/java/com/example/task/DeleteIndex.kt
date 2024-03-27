package com.example.task

fun main() {

    val arr = arrayOf("apple", "banana", "cherry", "mango")
    val index = 0
    val resultArray = arr.sliceArray(0 until index) + arr.sliceArray(index + 1 until arr.size)
    println(resultArray.contentToString())


}