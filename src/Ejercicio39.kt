//Una persona se encuentra en la disyuntiva de comprar un automóvil o un terreno, los cuales
//cuestan exactamente la misma cantidad de dinero. Sabe que mientras el automóvil se devalúa,
//con el terreno sucede lo contrario. Esta persona comprará el automóvil si al cabo de tres años la
//devaluación de éste no es mayor que la mitad del incremento del valor del terreno. Ayúdele a esta
//persona a determinar si debe o no comprar el automóvil.
class Ejercicio_39(){
    fun ejercicio39(){

        println("Ingrese el valor del automovil o terreno: ")
        val Precio = readLine()!!.toDouble()

        println("Ingrese el porcentaje de devaluación anual del automovil: ")
        val Devaluacion_auto = readLine()!!.toDouble()

        println("Ingrese el porcentaje de incremento anual del terreno: ")
        val Incremento_terreno = readLine()!!.toDouble()

        val Val_auto_3anos = Precio * (1 - Devaluacion_auto/100)*3
        val Val_terreno_3anos = Precio * (1 + Incremento_terreno/100)* 3

        val Mitad_terreno_3anos = Val_terreno_3anos / 2
        if (Val_auto_3anos <= Mitad_terreno_3anos){
            println("Se recomienda comprar el automovil.")
        }else{
            println("Se recomienda comprar el terreno")
        }
    }
}

fun main(){
    val ejercicio39 = Ejercicio_39()
    ejercicio39.ejercicio39()
}