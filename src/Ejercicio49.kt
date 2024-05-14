//100 personas presentaron una prueba constituida por 3 preguntas. Se requiere desarrollar un
//algoritmo o programa que permita determinar la cantidad de personas que respondieron:
//
//
//a. correctamente las tres preguntas.
//b. Correctamente solamente la primera y la segunda pregunta.
//c. Correctamente solamente la primera y la tercera pregunta.
//d. Correctamente solamente la segunda y la tercera pregunta.
//e. Correctamente la primera pregunta por lo menos.
//f. Correctamente la segunda pregunta por lo menos.
//g. Correctamente la tercera pregunta por lo menos.
//h. Además, cuántos no respondieron correctamente ninguna pregunta.
class Ejercicio_49(){
    fun ejercicio49(){

        val Total_personas = 100
        val Respuestas_correctas = arrayOf(0,0,0)
        var Respuestas_1ra_pre = 0
        var Respuestas_2da_pre = 0
        var Respuestas_3ra_pre = 0

        for (i in 0 until Total_personas){
            val Respuesta_persona = leerRespuestaPersona()

            Respuestas_correctas[0] += if (Respuesta_persona[0]) 1 else 0
            Respuestas_correctas[1] += if (Respuesta_persona[1]) 1 else 0
            Respuestas_correctas[2] += if (Respuesta_persona[2]) 1 else 0

            Respuestas_1ra_pre += if (Respuesta_persona[0]) 1 else 0
            Respuestas_2da_pre += if (Respuesta_persona[1]) 1 else 0
            Respuestas_3ra_pre += if (Respuesta_persona[2]) 1 else 0

        }
        val A = Respuestas_correctas[0] + Respuestas_correctas[1] + Respuestas_correctas[2]
        val B = Respuestas_1ra_pre - Respuestas_correctas[0]
        val C = Respuestas_2da_pre - Respuestas_correctas[1]
        val D = Respuestas_3ra_pre - Respuestas_correctas[2]
        val E = Respuestas_1ra_pre
        val F = Respuestas_2da_pre
        val G = Respuestas_3ra_pre
        val H = Total_personas - (A + B + C + D + E + F + G)

        println("A. Tres preguntas correctas: $A")
        println("B. Primera y Segunda: $B")
        println("C. Primera y Tercera: $C")
        println("D. Segunda y Tercera: $D")
        println("E. Primera: $E")
        println("F. Segunda: $F")
        println("G. Tercera: $G")
        println("H. Ninguna correcta: $H")
    }
    private fun leerRespuestaPersona():BooleanArray{
        return booleanArrayOf(true,false,true)
    }
}

fun main(){
    val ejercicio49 = Ejercicio_49()
    ejercicio49.ejercicio49()
}