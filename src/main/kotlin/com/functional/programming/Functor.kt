package com.functional.programming

fun main() {
  listOf(1, 2, 3)
      .map { i -> i * 2 }
      .map(Int::toString)
      .forEach(::println)
}
