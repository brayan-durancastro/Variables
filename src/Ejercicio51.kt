//Calcular el término doceavo y la suma de los doce primeros términos de la sucesión: 6, 11, 16, 21.
//Respuesta: a12=61, suma=402.
class Ejercicio_51(){
    fun ejercicio51(){

        val Primer_termino = 6
        val Diferencia_comun = 5
        val Numero_termino = 12

        val a12 = Primer_termino + Diferencia_comun * (Numero_termino - 1)
        println("Termino doceavo: $a12")

        val suma12 = (Numero_termino * (Primer_termino +a12)) / 2
        println("suma de los doce primeros terminos: $suma12")
    }
}

fun main(){
    val ejercicio51 = Ejercicio_51()
    ejercicio51.ejercicio51()
}