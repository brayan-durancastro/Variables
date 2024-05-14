//Una empresa que comercializa cosméticos tiene organizados a sus vendedores en tres
//departamentos y ha establecido un programa de incentivos para incrementar su productividad. El
//gerente, al final del mes, pide el importe global de las ventas de los tres departamentos y aquellos
//que excedan el 33% de las ventas totales se les paga una cantidad extra equivalente al 20% de su
//salario mensual. Si todos los vendedores ganan lo mismo, determinar cuánto recibirán los
//vendedores de los tres departamentos al finalizar el mes.
class Ejercicio_29(){
    fun ejercicio29(){

        println(" Ingrese las ventas totales del primer departamento: ")
        val Departamento1 = readLine()!! . toDouble()

        println("Ingrese las ventas totales del segundo departamento: ")
        val Departamento2 = readLine()!! . toDouble()

        println("Ingrese las ventas totales del tercer departamento: ")
        val Departamento3 = readLine()!! . toDouble()

        val VentasTotales = (Departamento1 + Departamento2 + Departamento3)
        val Umbralventas = VentasTotales * 0.33
        val Incento_ind = 0.2

        val Incentivo_Dep1 = if (Departamento1 > Umbralventas) Incento_ind else 0.0
        val Incentivo_Dep2 = if (Departamento2 > Umbralventas) Incento_ind else 0.0
        val Incentivo_Dep3 = if (Departamento3 > Umbralventas) Incento_ind else 0.0

        val TotalIncentivos = (Incentivo_Dep1 + Incentivo_Dep2 + Incentivo_Dep3)

        val PagoTotal = (VentasTotales + TotalIncentivos)

        println("Las ventas totales de los 3 departamentos son: $VentasTotales")
        println("Los incentivos totales de los 3 departamentos son: $TotalIncentivos")
        println("El pago total es: $PagoTotal")
        }
    }

        fun main(){
            val ejercicio29 = Ejercicio_29()
            ejercicio29.ejercicio29()
        }