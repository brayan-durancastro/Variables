//Un científico desea que un algoritmo le ayude en su trabajo analizándole tres valores que se
//suministran, para determinar si los dos primeros son las medidas de una figura conocida. Para ello,
//calcule el área de cada una de las figuras que se mencionan a continuación y compárela con el
//tercer valor suministrado; si hay coincidencia, imprima un mensaje que indique de qué figura se
//trata. Las figuras a analizar son:
class Ejercicio_27(){
    fun ejercicio27(){

        println("Ingrese el primer valor: ")
        val valor1 = readLine()!! . toDouble()

        println("Ingrese el segundo valor: ")
        val valor2 = readLine()!! . toDouble()

        println("Ingrese el tercer valor: ")
        val Area = readLine()!! . toDouble()

        val AreaTriangulo = (valor1 * valor2) / 2
        val AreaCircluo = Math.PI * Math.pow (valor1 / valor2, 2.0)
        val AreaRectangulo =  valor1 * valor2

        if (AreaTriangulo== Area) {
            println("Los valores del triangulo son: $AreaTriangulo")
        }else if (AreaCircluo== Area){
            println("El area del circulo es: $AreaCircluo")
        }else if (AreaRectangulo== Area){
            println("Los valores del rectangulo son: $AreaRectangulo")
        }else{
            println("Las dimesniones ingresadas no coinciden con ninguna figura.")
        }
    }
}

fun main(){
    val ejercicio27= Ejercicio_27()
    ejercicio27.ejercicio27()
}