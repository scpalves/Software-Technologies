function KeyValuePairs(args) {
    let keyToSearch = args.splice(args.length - 1, 1).toString();
    let keysAndValues = args.splice(0, args.length);

    let obj = {};

    for(let i = 0; i < keysAndValues.length; i++){
        let keyAndValue = keysAndValues[i].split(' ');
        let key = keyAndValue[0];
        let value = keyAndValue[1];

        if(!(key in obj)){
            obj[key] = '';
        }
        obj[key] = value;
    }

    let isFound = false;

    for (let element in obj){
        if(element === keyToSearch){
            console.log(obj[element]);
            isFound = true;
        }
    }

    if(!isFound){
        console.log('None');
    }
}
KeyValuePairs(['key value', 'key eulav', 'test tset', 'key']);