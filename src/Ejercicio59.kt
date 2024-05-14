//Desarrolle un programa que capture las notas del primer parcial de Matemática, Programación
//e inglés de un grupo indeterminado de alumnos y calcule e imprima:
//a. Nota menor de Programación.
//b. Porcentaje de alumnos que no presentaron el examen de inglés, respecto a los que sí
//presentaron.
//c. Número de alumnos que aprobaron todas las materias.
//d. Promedio general en Programación.
//e. Porcentaje de alumnos que reprobaron Matemática, respecto al total de alumnos que
//presentaron el examen de matemática.
class Ejercicio_59(){
    fun ejercicio59(){

        var notaMenorProgramacion = Double.MAX_VALUE
        var alumnosSinExamenIngles = 0
        var alumnosAprobadosTodasMaterias = 0
        var totalAlumnosMatematica = 0
        var totalAlumnosReprobaronMatematica = 0
        var sumaNotasProgramacion = 0.0
        var totalAlumnosProgramacion = 0

        // Solicitamos al usuario ingresar las notas de los alumnos
        println("Ingrese las notas de los alumnos. Para finalizar, ingrese una nota negativa.")

        var notaMatematica: Double
        var notaProgramacion: Double
        var notaIngles: Double

        do {
            print("Nota de Matemática: ")
            notaMatematica = readLine()?.toDoubleOrNull() ?: 0.0

            // Verificamos si el alumno presentó el examen de Matemática
            if (notaMatematica >= 0) {
                totalAlumnosMatematica++

                // Verificamos si el alumno reprobó Matemática
                if (notaMatematica < 10) {
                    totalAlumnosReprobaronMatematica++
                }
            }

            print("Nota de Programación: ")
            notaProgramacion = readLine()?.toDoubleOrNull() ?: 0.0

            // Verificamos si esta es la nota menor en Programación
            if (notaProgramacion < notaMenorProgramacion) {
                notaMenorProgramacion = notaProgramacion
            }

            // Calculamos el promedio en Programación
            if (notaProgramacion >= 0) {
                sumaNotasProgramacion += notaProgramacion
                totalAlumnosProgramacion++
            }

            print("Nota de Inglés: ")
            notaIngles = readLine()?.toDoubleOrNull() ?: 0.0

            // Verificamos si el alumno no presentó el examen de Inglés
            if (notaIngles < 0) {
                alumnosSinExamenIngles++
            }

            // Verificamos si el alumno aprobó todas las materias
            if (notaMatematica >= 10 && notaProgramacion >= 10 && notaIngles >= 10) {
                alumnosAprobadosTodasMaterias++
            }

        } while (notaMatematica >= 0)  // Continuamos ingresando notas hasta que se ingrese una nota negativa

        // Calculamos los porcentajes
        val porcentajeSinExamenIngles = (alumnosSinExamenIngles.toDouble() / totalAlumnosMatematica) * 100
        val porcentajeReprobadosMatematica = (totalAlumnosReprobaronMatematica.toDouble() / totalAlumnosMatematica) * 100
        val promedioProgramacion = if (totalAlumnosProgramacion > 0) sumaNotasProgramacion / totalAlumnosProgramacion else 0.0

        // Imprimimos los resultados
        println("a. Nota menor de Programación: $notaMenorProgramacion")
        println("b. Porcentaje de alumnos sin examen de Inglés: $porcentajeSinExamenIngles%")
        println("c. Número de alumnos que aprobaron todas las materias: $alumnosAprobadosTodasMaterias")
        println("d. Promedio general en Programación: $promedioProgramacion")
        println("e. Porcentaje de alumnos que reprobaron Matemática: $porcentajeReprobadosMatematica%")
    }
}

fun main(){
    val ejercicio59 = Ejercicio_59()
    ejercicio59.ejercicio59()
}