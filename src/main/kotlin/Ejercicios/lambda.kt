package org.example
// El constructor principal va en la propia cabecera de la clase.
// val/var en los parámetros crea directamente las propiedades.
class Alumno(val nombre: String, var nota: Double) {

    // bloque de inicialización: se ejecuta al construir el objeto
    init {
        require(nota in 0.0..10.0) { "Nota fuera de rango" }
    }

    fun estaAprobado(): Boolean = nota >= 5.0
}
fun main() {


    val a = Alumno("Ana", 18.0)     // sin "new"
    println(a.nombre)              // acceso por propiedad, no por getter
    a.nota = 9.0
}