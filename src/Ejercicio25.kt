//Escriba un algoritmo, que dado como dato el sueldo de un trabajador, le aplique un aumento del
//15% si su sueldo es inferior a Bs. 40.000 y 12% en caso contrario. Imprima el nuevo sueldo del
//trabajador.
class Ejercicio_25 {
    fun ejercicio25() {

        // Solicitar el sueldo del trabajador
        print("Ingrese el sueldo del trabajador: ")
        val sueldoTrabajador = readLine()!!.toDouble()

        // Calcular el aumento
        var aumento: Double
        if (sueldoTrabajador < 40000.0) {
            aumento = sueldoTrabajador * 0.15
        } else {
            aumento = sueldoTrabajador * 0.12
        }

        // Calcular el nuevo sueldo
        val nuevoSueldo = sueldoTrabajador + aumento

        // Mostrar el nuevo sueldo
        println("El nuevo sueldo del trabajador es de: $$nuevoSueldo")
    }
}

fun main(){
    val ejercicio25 = Ejercicio_25()
    ejercicio25.ejercicio25()
}