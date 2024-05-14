//Una compañía de alquiler de automóviles sin conductor, desea calcular y mostrar lo que debe pagar
//cada cliente, de acuerdo a las siguientes condiciones:
//a. Si no se rebasan los 300 km, se cancelan 5000 Bolívares
//b. Si la distancia recorrida es superior a 300 km
// Pero inferior a 1000 se cobran 5000 Bolívares más 200 Bolívares por cada kilómetro
//superior a 300.
// Si es superior a 1000 se cobran 5000 Bolívares más 200 Bolívares por cada kilómetro,
//para las distancias entre 300 y 1000 kilómetros y 150 Bolívares por cada kilómetro para
//las distancias mayores a 1000.

class Ejercicio_31(){
    fun ejercicio31(){

        println("Ingrese la distancia recorrida en kilometros: ")
        val Distancia_recorrida = readLine()!! . toDouble()

        val Pago: Double
        if (Distancia_recorrida <= 300){
            Pago = 5000.0
        }else if (Distancia_recorrida <= 1000){
            Pago = 5000 + (Distancia_recorrida - 300) * 200
        }else{
            Pago = 5000 + (700 * 200) + ((Distancia_recorrida - 1000) * 150)
        }

        println("Distancia recorrida : $Distancia_recorrida km")
        println("Pago $Pago Bolivares")
    }
}

fun main(){
    val ejercicio31 = Ejercicio_31()
    ejercicio31.ejercicio31()
}