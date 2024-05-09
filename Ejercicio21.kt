//Un mayorista compra a un agricultor un lote de X naranjas a Bs. Y la docena. Después de vender
//todas las naranjas a los detallistas, obtiene Bs. K. Calcular el porcentaje de ganancia obtenida en la
//inversión. Pruebe su programa con los siguientes valores: X=48000, Y=6, K=42000 para obtener 75%
//como resultado.
class Ejercicio_21(){
    fun ejercicio21(){

        val X = 48000
        val Y = 6
        val K = 42000

        val docenas_compradas = X / 12
        val costoTotalcompra = docenas_compradas * Y
        val total_venta = docenas_compradas * K
        val Ganancia = total_venta - costoTotalcompra
        val Porcentaje_ganancia = (Ganancia / costoTotalcompra) * 100

        println("El procentaje de la ganancia obtenida en la inversion es de: $Porcentaje_ganancia")
    }
}

fun main(){
    val ejercicio21 = Ejercicio_21()
    ejercicio21.ejercicio21()
}