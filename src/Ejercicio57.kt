import kotlin.math.abs

//Para calcular la raíz cuadrada de un número N positivo, Herón de Alejandría ideó la siguiente fórmula:
//RN = (X + N / X) /2, donde RN es la raíz de N y se calcula hasta cuando la diferencia entre X y RN es
//menor que 0.000001; tomando X el valor de RN en cada iteración. Se debe leer el número y asegurar
//que es positivo. Se puede iniciar el cálculo dándole a X el valor 0.1.
class Ejercicio_57(){
    fun ejercicio57(){

        println("Ingrese un numero positivo para calcular su raiz cuadrada: ")
        var N = readLine()!!.toDoubleOrNull()

        while (N == null || N <= 0){
            println("Ingrese un numero positivo valido: ")
            N = readLine()?.toDoubleOrNull()
        }
        var X = 0.1

        var RN = (X + N / X) / 2
        while (abs(X - RN) >= 0.000001){
            X = RN
            RN = (X + N / X) / 2
        }
        println("La raiz cuadradad de $N es aproximadamente $RN")
    }
}

fun main(){
    val ejercicio57 = Ejercicio_57()
    ejercicio57.ejercicio57()
}