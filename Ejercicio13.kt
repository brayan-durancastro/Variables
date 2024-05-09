//Determine cuánto dinero hay en un banco que contiene N1 billetes de 50000, N2 billetes de 20000,
//N3 billetes de 10000, N4 billetes de 5000, N5 billetes de 2000, N6 billetes 1000, N7 billetes de 500 y
//N8 billetes de 100.
class Ejercicio_13{
    fun ejercicio13(){
        val Denominaciones = listOf(50000, 20000, 10000, 5000, 2000, 1000, 500, 100)

        val numBills = mutableListOf<Int>()
        for (denomination in Denominaciones){
            print("Ingrese la cantidad de billetes de $denomination: ")
            val input = readLine()?: "0"
            if (!input.matches(Regex("\\d+")) || input.toInt()<0){
                println("Entrada no valida. Ingrese un numero entero no negativo. ")
                return
            }
            numBills.add(input.toInt())
        }
    val total = numBills.zip(Denominaciones){billCount, value ->billCount * value }.sum()
        println("\nEl dinero total del banco es: $$total")
    }
}

fun main(){
        val ejercicio13 = Ejercicio_13()
        ejercicio13.ejercicio13()
}