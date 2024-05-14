//Diseñe un algoritmo o programa que permita calcular la multiplicación de dos números, utilizando el
//método de la multiplicación Rusa, el cual consiste en multiplicar por dos el multiplicando y dividir
//entre dos el multiplicador hasta que el multiplicador tome el valor 1. Durante este proceso, se deben
//sumar todos los multiplicandos correspondientes a multiplicadores impares y este resultado es el de
//la multiplicación. Ejemplo:
//a. 25 x 7 = 175 (multiplicador = 25, multiplicando = 7)
//b. 25 7
//c. 12 14
//d. 6 28 suma= 7 + 56 + 112 = 175
//e. 3 56
//f. 1 112
class Ejercicio_61(){
    fun ejercicio61(){

        fun multiplicacionRusa(multiplicador: Int, multiplicando: Int): Int {
            var resultado = 0
            var m = multiplicador
            var n = multiplicando

            while (n > 0) {
                if (n % 2 != 0) {
                    resultado += m
                }
                m *= 2
                n /= 2
                println("Multiplicador: $m, Multiplicando: $n, Suma parcial: $resultado")
            }

            return resultado
        }

        fun main() {
            val multiplicador = 25
            val multiplicando = 7

            println("Calculando la multiplicación de $multiplicador x $multiplicando utilizando el método de la multiplicación Rusa:")
            val resultado = multiplicacionRusa(multiplicador, multiplicando)
            println("El resultado de la multiplicación es: $resultado")
        }
    }
}

fun main(){
    val ejercicio61 = Ejercicio_61()
    ejercicio61.ejercicio61()
}