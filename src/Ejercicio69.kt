//Dos números A y B son amigos, cuando la suma de los divisores menores que A es igual a B, al mismo
//tiempo cuando la suma de los divisores menores que B es igual a A. Los dos menores números amigos
//son 220 y 284, debido a que:
//a. divisores de 220 1+2+4+5+10+11+20+22+44+45+110 = 284
//b. divisores de 284 1+2+4+71+142 = 220
//c. los siguientes pares de amigos son: 1184 y 1210; 2620 y 2924; 5020 y 5564, etc.

class Ejercicio_69(){
    fun ejercicio69(){

        fun Suma_Divisores(Numero: Int):Int{
            var Suma = 0
            for (i in 1 until Numero){
                if (Numero % i == 0){
                    Suma +=1
                }
            }
            return Suma
        }

        fun Numeros_Pares(Rango: Int){
            val Amigos = mutableListOf<Pair<Int,Int>>()

            for (a in 2..Rango){
                val B = Suma_Divisores(a)
                if (B > a && Suma_Divisores(B)==a){
                    Amigos.add(Pair(a,B))
                }
            }

            if (Amigos.isEmpty()){
                println("No se encontraron numeros amigos en el rango hasta $Rango.")
            }else{
                println("Pares de numeros amigos encontrados:")
                Amigos.forEachIndexed() { index, par ->
                    println("(${par.first}, ${par.second})") }
            }

            fun main(){
                val Rango = 10000
                Numeros_Pares(Rango)
            }
        }
    }
}

fun main(){
    val ejercicio69 = Ejercicio_69()
    ejercicio69.ejercicio69()
}