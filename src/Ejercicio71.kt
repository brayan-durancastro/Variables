//La UNICEF desea obtener información estadística sobre los orfanatorios ubicados dentro de la
//República y sobre los niños huérfanos internados en esos orfanatorios. Por cada niño se conoce:
//sexo, edad, nombre del orfanatorio y estado de la República al que pertenece el Orfanatorio. Escriba
//un Programa para calcular y mostrar lo siguiente:
//a. Porcentaje de huérfanos del Estado Táchira y del Distrito Capital respecto al total del País.
//b. Número de huérfanos en cada grupo. Los grupos se definen según la Edad:
//Grupo 1: menores de 1 año
//Grupo 2: edad comprendida entre 1 y 3 años
//Grupo 3: edad comprendida entre 4 y 6 años
//Grupo 4: mayores de 6 años
//c. Cantidad de niños y niñas y porcentaje que representa cada uno.

class Ejercicio_71(){
    fun ejercicio71(){

        data class Huerfanos(
            val Sexo: String,
            val Edad: Int,
            val Nom_Orfanato: String,
            val Republica_Pertenece_Orfanato: String
        )

        fun main(){
            val Ninos = mutableListOf<Huerfanos>()

            Ninos.add(Huerfanos("M",13,"Orfanato A", "Estado Tachira"))
            Ninos.add(Huerfanos("F",12, "Orfanato B", "Distrito Capital"))
            Ninos.add(Huerfanos("F", 14, "Orfanato A", "Estado Tachira"))
            Ninos.add(Huerfanos("M",11, "Orfanato B", "Distrito Capital"))

            val Total_Ninos = Ninos.size
            val Tachiranos_Ninos = Ninos.count { it.Republica_Pertenece_Orfanato == "Tachira" }
            val Distrito_capital_Ninos = Ninos.count { it.Republica_Pertenece_Orfanato == "Distrito Capital" }

            val Porcentaje_Tachira = (Tachiranos_Ninos.toDouble() / Total_Ninos) * 100
            val Porcentaje_Distrito_Capital = (Distrito_capital_Ninos.toDouble()/Total_Ninos)*100

            println("Porcentaje de niños huerfanos en el estado Tachira: $Porcentaje_Tachira")
            println("Porcentaje de ninlos huerfanos en el Distrito Capital: $Porcentaje_Distrito_Capital")

            val Grupo_edad = mapOf(
                "Grupo 1" to Ninos.count { it.Edad < 1 },
                "Grupo 2" to Ninos.count { it.Edad in 1..3 },
                "Grupo 3" to Ninos.count { it.Edad in 3..6 },
                "Grupo 4" to Ninos.count { it.Edad in 6..9 },
                "Grupo 5" to Ninos.count { it.Edad in 9.. 12 },
                "Grupo 6" to Ninos.count { it.Edad in 12..15 },
                "Grupo 7" to Ninos.count { it.Edad > 15 }
            )

            println("Numero de huerfanos en cada grupo de edad:")
            Grupo_edad.forEach { (grupo, cantidad) ->
                print("$grupo: $cantidad")
            }

            val Cantidad_Ninos = Ninos.count { it.Sexo == "M" }
            val Cantidad_Ninas = Ninos.count { it.Sexo == "F" }

            val Porcentaje_Ninos = (Cantidad_Ninos.toDouble()/Total_Ninos)*100
            val Porcentaje_Ninas = (Cantidad_Ninas.toDouble()/Total_Ninos)*100

            println("Cantidad de niños: $Cantidad_Ninos(${String.format("%.2f", Porcentaje_Ninos)}%")
            println("Cantidad de niñas: $Cantidad_Ninas(${String.format("%.2f", Porcentaje_Ninas)}%")
        }
    }
}

fun main(){
    val ejercicio71 = Ejercicio_71()
    ejercicio71.ejercicio71()
}