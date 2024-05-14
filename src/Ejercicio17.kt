//Dados como datos el precio final pagado por un producto y su precio de venta al público (PVP), se
//requiere que calcule y muestre el porcentaje de descuento que le ha sido aplicado.
class Ejercicio_17(){
    fun ejercicio17(){

        val precio_final = 329.990
        val precio_publico = 439.990

        val calcular_descuento = precio_publico - precio_final
        val descuento_porcentaje = (calcular_descuento / precio_publico) * 100

        println("El porcentaje de descuento que ha sido aplicado en el producto es de: $descuento_porcentaje")
    }
}

fun main(){
    val ejercicio17 = Ejercicio_17()
    ejercicio17.ejercicio17()
}