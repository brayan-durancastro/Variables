class Ejercicio_41() {
    fun ejercicio41() {
        // Ingreso de la superficie del bosque en hectáreas
        println("Ingrese la superficie en hectareas: ")
        val superficieHectareas = readLine()!!.toDouble()

        // Conversión de hectáreas a metros cuadrados
        val superficieMetrosCuadrados: Double = superficieHectareas * 10000

        // Cálculo del porcentaje de cada tipo de árbol
        val porcentajePino: Double = if (superficieMetrosCuadrados > 1000000) 70.0 else 50.0
        val porcentajeOyamel: Double = if (superficieMetrosCuadrados > 1000000) 20.0 else 30.0
        val porcentajeCedro: Double = if (superficieMetrosCuadrados > 1000000) 10.0 else 20.0

        // Cálculo del número de árboles por tipo
        val numPinos: Int = ((porcentajePino / 100) * superficieMetrosCuadrados / 10).toInt()
        val numOyameles: Int = ((porcentajeOyamel / 100) * superficieMetrosCuadrados / 15).toInt()
        val numCedros: Int = ((porcentajeCedro / 100) * superficieMetrosCuadrados / 18).toInt()

        // Impresión de los resultados
        println("Número de pinos a sembrar: $numPinos")
        println("Número de oyameles a sembrar: $numOyameles")
        println("Número de cedros a sembrar: $numCedros")
    }
}

fun main(){
    val ejercicio41 = Ejercicio_41()
    ejercicio41.ejercicio41()
}