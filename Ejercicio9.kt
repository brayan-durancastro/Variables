//Calcular el salario neto de un trabajador en función del número de horas trabajadas, el precio de la
//hora y considerando un descuento fijo al sueldo base por concepto de impuestos del 20%.
class Ejercicio_9 {
    fun ejercicio9(){

        val horas_trabajadas =10
        val precio_horas =4050
        val impuestos = 0.20

        val salario_bruto = horas_trabajadas * precio_horas
        val Salario_neto = salario_bruto - impuestos

        println("El salario neto del trabajador es de: $Salario_neto")
    }
}

fun main() {
    val ejercicio9 = Ejercicio_9()
    ejercicio9.ejercicio9()
}