<?php
if(isset($_GET['num1']) && isset($_GET['num2']))
{
    $num1 = intval($_GET['num1']); // Convert first number to integer.
    $num2 = intval($_GET['num2']); // Convert first number to integer.
    $sum = $num1 + $num2;          // Calculating result between two numbers.
    echo "$num1 + $num2 = $sum";   // Printing out result
}
?>



<form>
    <div>First Number: <input type="number" name="num1"/></div>
    <div>Second Number: <input type="number" name="num2"></div>
    <div><input type="submit"></div>
</form>



