package org.example

fun main() {

    println("Ingrese número:")
    val numero = readLine()?.toIntOrNull()

    if (numero != null) {
        var esPrimo = true

        if (numero <= 1) {
            esPrimo = false
        } else {
            for (i in 2 until numero) {
                if (numero % i == 0) {
                    esPrimo = false
                    break
                }
            }
        }

        if (esPrimo) {
            println("$numero es número primo.")
        } else {
            println("$numero no es número primo.")
        }
    } else {
        println("caracter inválido")
    }
}
