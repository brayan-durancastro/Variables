//Un alumno desea saber cuál será su calificación final en la materia de computación. Dicha calificación
//se compone de los siguientes porcentajes: 55% del promedio de sus tres calificaciones parciales,
//30% de la calificación del examen final y 15% de la calificación de un trabajo final.
class Ejercicio_5{
    fun ejercicio5(){
        val calificaciones_parciales = arrayOf (3.5, 4.2, 4.0)
        val calificacion_examen = 4.6
        val trabajo_final = 3.8


        val promedio_parciales = calificaciones_parciales.average()/3
        val calificacion_final = (promedio_parciales*0.55) + (calificacion_examen*0.30) + (trabajo_final*0.15)

        println("La nota final de el alumno en la materia de computacion es de: \$${calificacion_final}")
    }
}

fun main() {
    val ejercicio5 = Ejercicio_5()
    ejercicio5.ejercicio5()
}