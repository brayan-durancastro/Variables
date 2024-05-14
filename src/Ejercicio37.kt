//Dados tres datos enteros positivos, que representan las longitudes de los lados de un probable
//triángulo, desarrolle un algoritmo que determine si los datos corresponden a un triángulo. En caso
//de que sí correspondan, escriba si el triángulo es equilátero, isósceles o escaleno. Calcule además
//su área. Considere que es triángulo si se cumple que la suma de los dos lados menores es mayor
//que la del lado mayor. Tome en cuenta además que el área de un triángulo la calculamos como:
//area = √S(S­A)(S­B)(S­C) donde S es la mitad de la suma de los lados A, B y C.
//Recuerde:
//Equilátero: todos los lados son iguales.
//Isósceles: 2 lados iguales y 1 diferente.
//Escaleno: Todos los lados diferentes.
class Ejercicio_37(){
    fun ejercicio37(){

        println("Ingrese el primer lado: ")
        val Lado1 = readLine()!!.toInt()

        println("Ingrese el segundo lado: ")
        val Lado2 = readLine()!!.toInt()

        println("Ingrese el tercer lado: ")
        val Lado3 = readLine()!!.toInt()

        if (Lado1 + Lado2 > Lado3 && Lado1 + Lado3 > Lado2 && Lado2 + Lado3 > Lado1) {
            val semiPerimetro = (Lado1 + Lado2 + Lado3) / 2.0

            val area =
                Math.sqrt(semiPerimetro * (semiPerimetro * Lado1) * (semiPerimetro * Lado2) * (semiPerimetro * Lado3))

            val Tipo_tri = when {
                Lado1 == Lado2 && Lado2 == Lado3 -> "Equilatero"
                Lado1 == Lado2 || Lado1 == Lado3 || Lado2 == Lado3 -> "Isoceles"
                else -> "Escaleno"
            }
            println("El triangulo es un triangulo $Tipo_tri.")
            println("Area: $area")
        }else{
            println("Las longitudes de los lados dados no forman un triangulo.")
        }
    }
}

fun main(){
    val ejercicio37 = Ejercicio_37()
    ejercicio37.ejercicio37()
}