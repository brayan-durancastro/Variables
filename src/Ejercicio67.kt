//Una persona adquiere una deuda de Bs. 12775, la cual cancela mediante pagos de montos crecientes
//de los cuales el primero es por Bs. 100 y además la diferencia de dos pagos consecutivos es Bs. 125.
//Determinar el número de pagos que realiza la persona así como el monto del último pago. Muestre
//en pantalla una tabla con el monto de cada pago y el monto pendiente por cancelar. Respuesta:
//número pagos = 14, monto del último = 1725.
class Ejercicio_67(){
    fun ejercicio67(){

        val Deuda_Inicial = 12775
        var Deuda = Deuda_Inicial
        var Monto_Pago = 100
        var Numero_Pagos = 0

        while (Deuda > 0){
            Numero_Pagos++
            val Monto_Ultimo_Pago = Monto_Pago

            if (Deuda - Monto_Ultimo_Pago <= 0){
                Monto_Pago = Deuda
            }

            println("$Numero_Pagos\t\t\t$Monto_Pago\t\t\t$Deuda")

            Deuda -= Monto_Pago
            Monto_Pago += 125

            println("\nNumeros de pagos realizados: $Numero_Pagos")
            println("Monto ultimo pago: $Monto_Pago")
        }
    }
}

fun main(){
    val ejercicio67 = Ejercicio_67()
    ejercicio67.ejercicio67()
}