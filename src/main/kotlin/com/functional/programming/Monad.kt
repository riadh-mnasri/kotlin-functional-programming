package com.functional.programming

fun main() {
    val result = listOf(1, 2, 3)
            .flatMap { i ->
                listOf(i * 2, i + 3)
            }
            .joinToString()
    println(result)
}
