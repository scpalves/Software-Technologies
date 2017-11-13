function SumsByTowns(args) {
    let obj = {};
    for(let i = 0; i < args.length; i++){
        let strToObj = JSON.parse(args[i]);

        if(!(strToObj.town in obj)){
            obj[strToObj.town] = 0;
        }
        obj[strToObj.town] += strToObj.income;
    }

    let towns = Object.keys(obj).sort();

    for (let town of towns){
        console.log(town + ' -> ' + obj[town]);
    }
}
