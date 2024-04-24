<?php
echo "Por favor, introduce el salario diario del empleado: ";
$salario_diario = readline();
echo "Por favor, introduce el número de días trabajados: ";
$dias_trabajados = readline();
$salario_bruto = $salario_diario * $dias_trabajados;
$descuento_pension = $salario_bruto * 0.10;
$descuento_salud = $salario_bruto * 0.15;
$salario_neto = $salario_bruto - $descuento_pension - $descuento_salud;
echo "El salario bruto del empleado es: $salario_bruto" . PHP_EOL;
echo "El descuento por pensión es: $descuento_pension" . PHP_EOL;
echo "El descuento por salud es: $descuento_salud" . PHP_EOL;
echo "El salario neto a pagar al empleado es: $salario_neto";
?>