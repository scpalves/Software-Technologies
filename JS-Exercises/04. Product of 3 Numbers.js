function ProductOfThreeNumbers(arr) {

    let countOddNumbers = 0;

    for (let i = 0; i < arr.length; i++) {
        if(arr[i] < 0){
            countOddNumbers++;
        }
    }

    if(countOddNumbers % 2 != 0){
        console.log('Negative');
    } else {
        console.log('Positive');
    }
}
ProductOfThreeNumbers(['-3', '-4', '5'])