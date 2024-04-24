<?php
$año_actual=date("Y");
echo"Por favor, introdusca la edad de nacimiento";
$edad_nacimiento=readline();
$edad=$año_actual-$edad_nacimiento;
echo"tiene $edad años de edad"
?>