//En una encuesta de alumnos se tomaron los siguientes datos: edad, sexo, estado civil, y especialidad
//que cursa. La empresa encuestadora, desea generar las siguientes estadísticas:
//
//a. Promedio de edad de las mujeres.
//b. Promedio de edad de los hombres.
//c. Cantidad de hombres y de mujeres encuestados.
//d. Porcentaje de personas para cada uno de los tipos de estado civil, respecto al total.
//e. Cantidad de alumnos por especialidad y porcentaje que representan.
//f. Porcentaje de mujeres adultas, tomando en cuenta que los adultos son los que tienen más
//de 21 años.
//g. Porcentaje de hombres jóvenes, tomando en cuenta que estos son los que tienen menos
//de 21 años, pero más de 17.
//h. Cantidad de hombres solteros y cantidad de mujeres solteras.

class Ejercicio_63(){
    fun ejercicio63(){

        data class Alumnos(
            val Edad: Int,
            val Genero: String,
            val Est_civil: String,
            val Especialidad_cursa: String
        )

        val Estudiantes = listOf(
             Alumnos(19, "Mujer", "Soltera", "Computacion"),
             Alumnos(18, "Hombre","En una relacion", "Biologia"),
             Alumnos(21, "Hombre", "Soltero", "Fisica"),
             Alumnos(17, "Mujer", "En una relacion", "Matematicas"),
             Alumnos(23, "Mujer", "Soltera", "Medicina"),
             Alumnos(19, "Hombre", "Soltero", "Espanol")
        )

        val Mujeres = Estudiantes.filter {it.Genero == "Mujeres" }
        val Promedio_edad_Muj = Mujeres.map {it.Edad}.average()
        println("Promedio edad de mujeres: $Promedio_edad_Muj")

        val Hombres = Estudiantes.filter {it.Genero == "Hombres" }
        val Promedio_edad_Hom = Hombres.map {it.Edad}.average()
        println("Promedio edad de hombres: $Promedio_edad_Hom")

        val Cantidad_Hom = Hombres.size
        val Cantidad_Muj = Mujeres.size
        println("Cantidad de hombres: $Cantidad_Hom")
        println("Cantidad de mujeres: $Cantidad_Muj")

        val Estado_civil = Estudiantes.groupBy { it.Est_civil }.mapValues {it.value.size}
        val Total_alumnos = Estudiantes.size
        Estado_civil.forEach {(Est_civil, count) ->
            val Porcentaje = (count.toDouble() / Total_alumnos) * 100
            println("Porcentaje de $Est_civil: $Porcentaje%")
        }

        val Especialidad = Estudiantes.groupBy { it.Especialidad_cursa }. mapValues {it.value.size}
        Especialidad.forEach { (Especialidad_cursa, count) ->
            val Porcentaje = (count.toDouble() / Total_alumnos) * 100
            println("Cantidad de alumnos en $Especialidad_cursa: $count, porcentaje: $Porcentaje%")
        }

        val Mujeres_adultas = Mujeres.count { it.Genero == "Mujeres" && it.Edad > 21 }
        val Por_Mujeres_Adu = (Mujeres_adultas.toDouble()/ Cantidad_Muj) * 100
        println("Porcentaje de mujeres adultas: $Por_Mujeres_Adu%")

        val Hombres_jovenes = Hombres.count { it.Genero == "Hombres" && it.Edad > 17 && it.Edad < 21 }
        val Por_Hombres_Jov = (Hombres_jovenes.toDouble()/ Cantidad_Hom) * 100
        println("Porcentaje de hombres jovenes: $Por_Hombres_Jov")

        val Cantidad_Hombres_Sol = Estudiantes.count { it.Genero == "Hombres" && it.Est_civil == "Soltero" }
        println("Cantidad de hombre solteros: $Cantidad_Hombres_Sol")
        val Cantidad_Mujeres_Sol = Estudiantes.count { it.Genero == "Mujeres" && it.Est_civil == "Soltero" }
        println("Cantidad de mujeres solteras: $Cantidad_Mujeres_Sol")
    }
}

fun main(){
    val ejercicio63 = Ejercicio_63()
    ejercicio63.ejercicio63()
}