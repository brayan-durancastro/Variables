//Calcule e imprima el número de términos necesarios para que el valor de la siguiente sumatoria se
//aproxime los más cercanamente a 1000 sin que lo exceda: ∑((k∧2+1)/k), donde k=1,2,3,4,...
class Ejercicio_55(){
    fun ejercicio55(){

        fun sumatoria (n: Int): Double{
            var suma = 0.0
            for (k in 1..n){
                suma += (k * k + 1) / k.toDouble()
            }
            return suma
        }

        fun calcularNumerosTerminos(objetivo: Double):Int{
            var n = 1
            var sumaActual = sumatoria(n)

            while (sumaActual < objetivo){
                n++
                sumaActual =sumatoria(n)
            }
            return n
        }

        val objetivo = 1000.0
        val numeroTerminos = calcularNumerosTerminos(objetivo)
        println("Se necesitan $numeroTerminos terminos para aproximar la sumatoria a $objetivo sin excederlo.")
    }
}

fun main(){
    val ejercicio55 = Ejercicio_55()
    ejercicio55.ejercicio55()
}