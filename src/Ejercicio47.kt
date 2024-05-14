//Escriba un programa que imprima todos los enteros positivos impares menores que 100
//omitiéndose aquellos que sean divisibles por 7.
class Ejercicio_47(){
    fun ejercicio47(){

        for ( i in 1..99){
            if (i % 2==1){
                if (i % 7 != 0) {
                    println(i)
                }
            }
        }
    }
}

fun main(){
    val ejercicio47 = Ejercicio_47()
    ejercicio47.ejercicio47()
}