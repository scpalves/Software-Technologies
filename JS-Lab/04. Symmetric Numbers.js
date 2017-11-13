function SymetricNumbers(args) {
    let lastNumber = Number(args[0]);
    let result = '';

    for (let i = 1; i <= lastNumber; i++) {
        if (IsSymetric(i)) {
            result += i + ' ';
        }
    }

    console.log(result);

    function IsSymetric(number) {
        number = number.toString();
        let reversed = '';
        for (i = number.length - 1; i >= 0; i--) {
            reversed += number[i];
        }

        if (number === reversed) {
            return true;
        }
        return false;
    }
}

SymetricNumbers(['750']);