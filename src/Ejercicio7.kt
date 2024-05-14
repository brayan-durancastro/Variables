//Dada una cantidad en metros, se requiere que la convierta a pies y pulgadas, considerando lo
//siguiente: 1 metro = 39.27 pulgadas; 1 pie = 12 pulgadas.
class Ejercicio_7{
    fun ejercicio7(){
        val metros = 25

        val pulgadas_totales = metros*39.27
        val pie = pulgadas_totales/12
        val pulgadas_restantes = pulgadas_totales%12

        println("$metros metros son equivalentes a ${pie.toInt()} pies y ${pulgadas_restantes.toInt()} pulgadas.")
    }
}

fun main() {
    val ejercicio7 = Ejercicio_7()
    ejercicio7.ejercicio7()
}