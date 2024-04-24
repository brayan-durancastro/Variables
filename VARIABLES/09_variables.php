<?php
echo "Por favor, introduce el valor unitario del producto: ";
$valor_unitario = readline();
echo "Por favor, introduce la cantidad de productos comprados: ";
$cantidad = readline();
$subtotal = $valor_unitario * $cantidad;
$iva = $subtotal * 0.16;
$total = $subtotal + $iva;
echo "El subtotal de la compra es: $subtotal" . PHP_EOL;
echo "El monto del IVA es: $iva" . PHP_EOL;
echo "El total a pagar (incluyendo el 16% de IVA) es: $total";
?>