package org.example

fun main() {
    print("Introduce un año para comprobar si es bisiesto: ")

    val input = readlnOrNull() ?: ""
    val anio = input.toIntOrNull()

    if (anio == null) {
        println("Por favor, introduce un número de año válido.")
        return
    }

    val esBisiesto = when {
        anio % 400 == 0 -> true
        anio % 100 == 0 -> false
        anio % 4 == 0   -> true
        else            -> false
    }

    if (esBisiesto) {
        println("El año $anio ES bisiesto.")
    } else {
        println("El año $anio NO es bisiesto.")
    }
}