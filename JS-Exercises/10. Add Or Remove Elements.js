function AddOrRemoveElements(args) {

    let arr = new Array();

    for(let i = 0; i < args.length; i++){
        let inputLine = args[i].split(' ');
        let command = inputLine[0];
        let number = Number(inputLine[1]);

        if(command === 'add'){
            arr.push(number);
        } else {
            arr.splice(number,  1);
        }
    }

    for(let elements of arr){
        console.log(elements);
    }
}
AddOrRemoveElements(['add 3', 'add 5', 'remove 1', 'add 2']);