<?php
echo "Por favor, introduce la distancia en metros: ";
$metros = readline();
$kilometros = $metros / 1000;
$centimetros = $metros * 100;
$milimetros = $metros * 1000;
echo "La distancia de $metros metros equivale a:";
echo "- $kilometros kilómetros" . PHP_EOL;
echo "- $centimetros centímetros" . PHP_EOL;
echo "- $milimetros milímetros" . PHP_EOL;
?>