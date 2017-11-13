function TurnObjectsIntoJSONStrings(args) {

    let data = {};

    for(let i = 0; i < args.length; i++){
        let sentence = args[i].split(' -> ');
        let key = sentence[0];
        let value = sentence[1];

        if(key === 'grade' || key === 'age'){
            value = Number(value);
        }
    data[key] = value;
    }

    let str = JSON.stringify(data);
    console.log(str);
}
TurnObjectsIntoJSONStrings(['name -> Angel', 'surname -> Georgiev', 'age -> 20', 'grade -> 6.00', 'date -> 23/05/1995', 'town -> Sofia']);