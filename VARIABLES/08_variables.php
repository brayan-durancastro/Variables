<?php
$suma = 0;
for ($i = 1; $i <= 5; $i++) {
echo "Por favor, introduce el número $i: ";
$numero = readline(); 
$suma += $numero;
}
$promedio = $suma / 5;
echo "El promedio de los 5 números ingresados es: $promedio";
?>