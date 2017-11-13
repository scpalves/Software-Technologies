function MultiplyValuesForAKey(args) {
    let keyToSearch = args.splice(args.length - 1, 1).toString();

    let obj =  {};

    for(let i = 0; i < args.length; i++){
        let keysAndValues = args[i].split(' ');
        let key = keysAndValues[0];
        let values = keysAndValues[1];

        if(!(key in obj)){
            obj[key] = new Array();
        }
        obj[key].push(values);
    }

    let isFound = false;

    for(let element in obj){
        if (element === keyToSearch)
        for(let values of obj[element]){
            console.log(values);
            isFound = true;
        }
    }

    if(!isFound){
        console.log('None');
    }
}
MultiplyValuesForAKey(['key value', 'key eulav', 'test tset', 'key']);