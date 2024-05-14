//Desarrolle un algoritmo, que dado como dato una temperatura en grados Fahrenheit, determine
//el deporte que es apropiado practicar a esa temperatura, teniendo en cuenta la siguiente tabla:
class Ejercicio_35(){
    fun ejercicio35(){

        println("Introduzca la temperatura en grados Fahrenheit: ")
        val Grados_Far = readLine()!!.toDouble()

        val Rangos_Temp = listOf(
            0.0..10.0 to "Marcha",
            10.0..32.0 to "Esquí",
            32.0..70.0 to "Golf",
            70.0..85.0 to "Tenis",
            85.0..Double.POSITIVE_INFINITY to "Natacion"
        )

        val Deportes = Rangos_Temp.firstOrNull {it.first.contains(Grados_Far) }?.second?: "No encontramos ningun deporte."
        println("El deporte apropiado para una temperatura de $Grados_Far es: $Deportes")
    }
}

fun main(){
    val ejercicio35=Ejercicio_35()
    ejercicio35.ejercicio35()
}