function LargestThreeNumbers(arr) {
    arr = arr.map(Number)
        .sort((a, b) => b - a)
        .splice(0, 3);

    for(let number of arr){
        console.log(number);
    }
}
LargestThreeNumbers(['30', '20'])