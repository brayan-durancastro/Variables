//en una tienda efectúan un descuento a los clientes dependiendo del monto de la compra.
// El descuento se efectúa con base en el siguiente criterio:
//a. Si el monto es inferior a $500, no hay descuento.
//b. Si está comprendido entre $500 y $1000 inclusive, se hace un descuento del 5%
//c. Si está comprendido entre $1000 y $7000 inclusive, se hace un descuento del 11%
//d. Si está comprendido entre $7000 y $15000 inclusive, el descuento es del 18%
//e. Si el monto es mayor a $15000, hay un 25% de descuento.
//Calcule y muestre el nombre del cliente, el monto de la compra, monto a pagar y descuento recibido.
class Ejercicio_33 {
    fun ejercicio33() {

        println("Ingrese su nombre: ")
        val Nombre_cliente = readLine()!!
        println("Ingrese el valor de su compra: ")
        val compraRealizada = readLine()!!.toDouble()

        var descuento = 0.0
        var pagoFinal = compraRealizada

        if (compraRealizada < 500) {
            descuento = 0.0
        } else if (compraRealizada <= 1000) {
            descuento = 0.05
        } else if (compraRealizada <= 7000) {
            descuento = 0.11
        }else if (compraRealizada <= 15000){
            descuento = 0.18
        }else if (compraRealizada > 15000){
            descuento = 0.25
        }

        pagoFinal -= compraRealizada * descuento

        println("Compra realizada: $$compraRealizada")
        println("Descuento: ${descuento * 100}%")
        println("Descuento en la compra: $${(compraRealizada * descuento).toFixed(2)}")
        println("Pago final: $$pagoFinal")
    }
}

fun Double.toFixed(decimalPlaces: Int) = "%.${decimalPlaces}f".format(this)

fun main(){
    val ejercicio33 = Ejercicio_33()
    ejercicio33.ejercicio33()
}