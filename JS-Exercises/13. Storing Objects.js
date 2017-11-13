function  StoringObj(args) {
    for(let i = 0; i < args.length; i++){
        let currentInfo = args[i].split(' -> ')
        console.log('Name: ' + currentInfo[0])
        console.log('Age: ' + currentInfo[1])
        console.log('Grade: ' + currentInfo[2])
    }
}
StoringObj(['Pesho -> 13 -> 6.00', 'Ivan -> 12 -> 5.75'])