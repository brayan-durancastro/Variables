//Un vendedor recibe un sueldo base, más un 10% extra por comisiones de sus ventas. El vendedor
//desea saber cuánto dinero obtendrá por concepto de comisiones por las tres ventas que realizó en
//el mes y el total que recibirá tomando en cuenta su sueldo base y sus comisiones.
class Ejercicio_3 {
    fun ejercicio3(){
        val sueldo_base = 1300000
        val ventas = arrayOf(200, 650, 8900)

        val extra_comisiones = ventas.sum() * 0.10
        val total = sueldo_base + extra_comisiones

        println ("El vendedor recibira \$${extra_comisiones} por comisiones. ")
        println ("El total a recibir, incluyendo su suledo base es de \$${total}")
    }
}

fun main() {
    val ejercicio2 = Ejercicio_3()
    ejercicio2.ejercicio3()
}