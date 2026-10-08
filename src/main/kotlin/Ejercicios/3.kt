package org.example

fun main() {
    print("Dame un numero: ")
    val a = readlnOrNull() ?: "0"

    val b = a.toIntOrNull() ?: 0

    val c = if (b%7==0) "Es multiplo de 7" else "No es multiplo de 7"
    println(c)
}


