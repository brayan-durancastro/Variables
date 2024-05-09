//Calcular y mostrar el monto total a pagar en un mes de luz eléctrica, teniendo como dato la lectura
//anterior, la lectura actual y el costo por kilovatio.
class Ejercicio_15() {
    fun ejercicio15() {

        val lec_Anterior = 1000
        val lec_Actual = 1200
        val costo_kilovatio = 0.12

        val kilovatio_cons_hora = lec_Anterior - lec_Actual
        val pago_mensual = kilovatio_cons_hora * costo_kilovatio

        println("El monto total a pagar en un mes de luz electrica es de: $$pago_mensual")
    }
}

fun main(){
    val ejercicio15 = Ejercicio_15()
    ejercicio15.ejercicio15()
}