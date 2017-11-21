<?php
    function fromCelToFahren(float $celsius) : float
    {
        return $celsius * 1.8 + 32; // Calculating Fahrenheit
    }
    function fromFahrenToCel(float $fahren) : float
    {
        return ($fahren - 32) / 1.8; // Calculating Celsius
    }

    $msgAfterCelsius = "";
    if(isset($_GET['cel'])){ // Checking if is value set
        $cel = floatval($_GET['cel']); // Convert to float number
        $fah = fromCelToFahren($cel); // Using metod to calculate fahrenheit
        $msgAfterCelsius = "$cel &deg;C = $fah &deg;F"; // Print final result
    }

    $msgAfterFahrenheit = "";
    if(isset($_GET['fah'])){ // Checking if is value set
        $fah = floatval($_GET['fah']); // Convert to float number
        $cel = fromFahrenToCel($fah); // Using metod to calculate celsius
        $msgAfterFahrenheit = "$fah &deg;F = $cel &deg;C"; // Print final result
    }

?>

<form>
    Celsius: <input type="text" name="cel"/>
    <input type="submit" value="Convert">
    <?= $msgAfterCelsius?>
</form>
<form>
    Fahrenheit: <input type="text" name="fah">
    <input type="submit" value="Convert">
    <?= $msgAfterFahrenheit?>
</form>


