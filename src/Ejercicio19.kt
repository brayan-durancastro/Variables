//En un hospital rural existen tres áreas: Ginecología, Pediatría y Traumatología. El presupuesto anual
//del hospital se reparte conforme a la siguiente tabla:
class Ejercicio_19(){
    fun ejercicio19(){

        val Presupuesto_anual = 420.000
        val porcentaje_Gin = 0.40
        val porcentaje_Ped = 0.30
        val porcentaje_Tra = 0.30

        val calculo1 = porcentaje_Gin * Presupuesto_anual
        val calculo2 = porcentaje_Ped * Presupuesto_anual
        val calculo3 = porcentaje_Tra * Presupuesto_anual

        println("La cantidad de dinero que recibe el area de Ginecologia es de: $calculo1")
        println("La cantidad de dinero que recibe el area de Pediatria es de: $calculo2")
        println("La cantidad de dinero que recibe el area de Traumatologia es de: $calculo3")
    }
}

fun main (){
    val ejercicio19 = Ejercicio_19()
    ejercicio19.ejercicio19()
}