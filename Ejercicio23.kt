//Suponga que a partir de una Tonelada de maíz una planta productora obtiene M kilogramos de
//harina y N litros de aceite. La planta vende cada bulto de 24 paquetes de un kilogramo de harina en
//Bs. B1 y cada caja de 15 envases de aceite en Bs. B2. Suponiendo que la planta vende
//produce, calcular el ingreso total por la venta de cada tonelada de maíz, sabiendo además que cada
//kilogramo de harina y cada litro de aceite que restan del embalaje se venden al detal a los precios de
//Bs. B3 y Bs. B4 respectivamente. Pruebe su algoritmo o programa con los sig. Valores: M=452,
//N=197, B1=132, B2= 180, B3= 7,50 y B4= 14,50. Respuesta: 4895
class Ejercicio_23(){
    fun ejercicio23() {
        val M = 452 //kilogramos de harina
        val N = 197 //litros de aceite
        val B1 = 132 //bulto de harina
        val B2 = 180 //bulto de aceite
        val B3 = 7.50 //precio de harina separada
        val B4 = 14.50 //precio de aceite separado

        val Bulto_harina = M / 24
        val Aceite_producido = N / 15
        val ingreso_bulto_harina = B1 * Bulto_harina
        val Ingreso_envase_aceite = B2 * Aceite_producido
        val Harina_separada = M - (Bulto_harina * 24)
        val Aceite_separado = N - (Aceite_producido * 15)

        val Ingreso_harina_separada = B3 * Harina_separada
        val Ingreso_aceite_separado = B4 * Aceite_separado

        val IngresoTotal =
            ingreso_bulto_harina + Ingreso_envase_aceite + Ingreso_harina_separada * Ingreso_aceite_separado
        println("El ingreso total de la tonelada de maiz en la planta productora es de: $IngresoTotal")
    }

    fun main() {
        val ejercicio23 = Ejercicio_23()
        ejercicio23.ejercicio23()
    }
}