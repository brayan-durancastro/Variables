//Se conoce de un trabajador su nombre, el número de horas normales trabajadas, el pago de una hora
//normal y el número de horas extras trabajadas. Además, que, cada hora extra se paga 25% más del
//valor de una hora normal. Si se deducen al trabajador sobre el sueldo base 5% del paro forzoso, 2%
//de política habitacional y 7% para caja de ahorro. Si se le asignan 25000 Bolívares por actualización
//académica, 17300 Bolívares por cada hijo y una prima por hogar de 18000 Bolívares. Calcule y
//muestre las asignaciones, las deducciones y el sueldo neto del trabajador.
class Ejercicio_11{
    fun ejercicio11(){

        val Nombre_empleado = "Antonio"
        val horas_trabajadas = 8
        val pago_horas = 3950

        //asignaciones
        val actualizacion_academica =25000
        val asignacion_porhijo = 17300
        val prima_hogar = 18000

        //deducciones
        val pago_forzoso = 0.05
        val politica_habitacional = 0.02
        val caja_de_ahorro = 0.07

        // calculo
        val salario_base = horas_trabajadas + pago_horas
        val total_asignaciones = actualizacion_academica + (asignacion_porhijo*2) + prima_hogar
        val total_deducciones = salario_base * (pago_forzoso - politica_habitacional - caja_de_ahorro)
        val sueldo_neto = salario_base+ total_asignaciones - total_deducciones

        println("Asignaciones: ")
        println("Actuaizacion academica: \$${actualizacion_academica}")
        println("asignacion por hijo (2 hijos): \$${asignacion_porhijo}")
        println("Prima por hogar: \$${prima_hogar}")
        println("\nDeducciones: ")
        println("Pago forzoso: \$${salario_base * pago_forzoso}")
        println("Politica habitacional: \$${salario_base * politica_habitacional}")
        println("Caja de ahorro: \$${salario_base * caja_de_ahorro}")
        println("Total de deducciones: \$${total_deducciones}")
        println("\nSueldo neto de $Nombre_empleado: \$${sueldo_neto}")
    }
}
fun main() {
    val ejercicio11 = Ejercicio_11()
    ejercicio11.ejercicio11()
}