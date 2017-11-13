function SetValuesInArray(args) {
    let arrayLenght = Number(args[0]);
    let arr = new Array(arrayLenght).fill(0);

   for(let i = 1; i < args.length; i++){
        let valuesAndIndexes = args[i].split(' - ');
        let index = Number(valuesAndIndexes[0]);
        let value = Number(valuesAndIndexes[1]);
        arr[index] = value;
    }

    for(let values of arr){
        console.log(values);
    }
}
SetValuesInArray(['3', '0 - 5', '1 - 6', '2 - 7']);