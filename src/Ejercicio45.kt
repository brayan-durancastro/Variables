class Ejercicio_45(){
    fun ejercicio45(){

        val A = 45.0
        val B = -6.0
        val C = - 11.0

        val Discriminant = B * B - 4.0 * A * C

        if (Discriminant > 0) {

            val Ruta1 = (-B + Math.sqrt(Discriminant)) / (2.0 * A)
            val Ruta2 = (-B - Math.sqrt(Discriminant)) / (2.0 * A)



            println("Raíz 1: $Ruta1")
            println("Raíz 2: $Ruta2")
        }else if (Discriminant == 0.0){

            val Ruta = -B / (2.0 * A)
            println("Raíz: $Ruta")
        }else{
            println("No hay raices reales para los coeficientes dados.")
        }
    }
}

fun main(){
    val ejercicio45 = Ejercicio_45()
    ejercicio45.ejercicio45()
}