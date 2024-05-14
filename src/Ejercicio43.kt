class Ejercicio_43(){
    fun ejercicio43(){

        val Capital_Actual:Double = 20000.0

        val Nuevo_Capital: Double = if (Capital_Actual < 0){
            10000.0
        }else if (Capital_Actual < 20000.0) {
            20000.0
        }else {
            Capital_Actual
        }
        val Equipo_Computo: Double = 5000.0
        val Equipo_mobiliario: Double = 2000.0
        val Capital_restante: Double = Nuevo_Capital - Equipo_Computo - Equipo_mobiliario

        val Insumos = Capital_restante / 2
        val Incentivo_personal: Double = Capital_restante - Insumos

        println("Capital actual: $Capital_Actual")
        println("Nuevo capital: $Nuevo_Capital")
        println("Equipo de computo: $Equipo_Computo")
        println("Equipo mobiliario: $Equipo_mobiliario")
        println("Insumos: $Insumos")
        println("Incentivos personales: $Incentivo_personal")
    }
}

fun main(){
    val ejercicio43 = Ejercicio_43()
    ejercicio43.ejercicio43()
}