//Calcular el sueldo neto de los trabajadores de una compañía sabiendo que este depende de los
//siguientes datos:
//• sueldo básico mensual 100000 si es obrero
//• sueldo básico mensual 165500 si es administrativo
//• sueldo básico mensual 250000 si es ejecutivo Las asignaciones y deducciones son:
//• aporte por cada hijo hasta 5 hijos 10% del sueldo básico
//• aporte por asistencia superior al 95% de los 30 días del mes 5% del sueldo básico.
//• Deducción del 10% del sueldo básico para la caja de ahorros.
//• Deducción para el seguro social 2% del sueldo básico
//Por cada empleado debe salir un registro con el nombre y cédula, sueldo básico, aporte a la Caja de
//Ahorros, seguro social y sueldo neto.

class Ejercicio_65(){
    fun ejercicio65(){

        data class Empleado(val nombre: String, val cedula: String, val tipo: String, val hijos: Int, val asistencia: Double)

        fun calcularSueldoNeto(empleado: Empleado): Double {
            val sueldoBasico = when (empleado.tipo) {
                "obrero" -> 100000.0
                "administrativo" -> 165500.0
                "ejecutivo" -> 250000.0
                else -> 0.0
            }

            val aporteHijos = if (empleado.hijos <= 5) 0.10 * sueldoBasico * empleado.hijos else 0.10 * 5 * sueldoBasico
            val aporteAsistencia = if (empleado.asistencia > 0.95) 0.05 * sueldoBasico else 0.0
            val deduccionCajaAhorros = 0.10 * sueldoBasico
            val deduccionSeguroSocial = 0.02 * sueldoBasico

            val sueldoNeto = sueldoBasico + aporteHijos + aporteAsistencia - deduccionCajaAhorros - deduccionSeguroSocial
            return sueldoNeto
        }

        fun main() {
            // Supongamos que tenemos una lista de empleados
            val empleados = listOf(
                Empleado("Juan", "123456789", "obrero", 3, 0.98),
                Empleado("Maria", "987654321", "administrativo", 2, 1.0),
                Empleado("Pedro", "456789123", "ejecutivo", 0, 0.97)
                // Agrega más empleados según sea necesario
            )

            // Calcular y mostrar el sueldo neto para cada empleado
            for (empleado in empleados) {
                val sueldoNeto = calcularSueldoNeto(empleado)
                val aporteCajaAhorros = 0.10 * sueldoNeto
                val aporteSeguroSocial = 0.02 * sueldoNeto

                println("Nombre: ${empleado.nombre}")
                println("Cédula: ${empleado.cedula}")
                println("Sueldo Básico: ${empleado.tipo}")
                println("Aporte a la Caja de Ahorros: $aporteCajaAhorros")
                println("Seguro Social: $aporteSeguroSocial")
                println("Sueldo Neto: $sueldoNeto")
                println()
            }
        }
    }
}

fun main(){
    val ejercicio65 = Ejercicio_65()
    ejercicio65.ejercicio65()
}