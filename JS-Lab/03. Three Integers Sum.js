function ThreeIntegersSum(args) {
    args = args[0].split(' ');
    let firstNumber = Number(args[0]);
    let secondNumber = Number(args[1]);
    let thirdNumber = Number(args[2]);

    if(firstNumber + secondNumber === thirdNumber){
        console.log(`${Math.min(firstNumber, secondNumber)} + ${Math.max(firstNumber, secondNumber)} = ${thirdNumber}`);
    } else if (firstNumber + thirdNumber === secondNumber){
        console.log(`${Math.min(firstNumber, thirdNumber)} + ${Math.max(firstNumber, thirdNumber)} = ${secondNumber}`);
    } else if (secondNumber + thirdNumber === firstNumber){
        console.log(`${Math.min(secondNumber, thirdNumber)} + ${Math.max(secondNumber, thirdNumber)} = ${firstNumber}`);
    } else{
        console.log('No');
    }
}