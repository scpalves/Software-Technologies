<?php
if(isset($_GET['text'])){
    $text = $_GET['text'];  // Taking words out
    preg_match_all('/\w+/', $text, $words); // Match all words
    $words = $words[0]; // Take full match Group
    $upperWords = array_filter($words, function ($word) { // Checking which are upperCaseWords
        return strtoupper($word) === $word;
    });

    echo implode(", ",$upperWords); // Print words connected by comma and space
}
?>

<form>
    <textarea rows="10" name="text"></textarea> <br>
    <input type="submit", value="Extract"/>
</form>
