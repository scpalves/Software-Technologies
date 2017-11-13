function ParseJSONOBjects(args) {
    for(let i = 0; i < args.length; i++){
        let currentSentence = JSON.parse(args[i]);
        console.log(`Name: ${currentSentence.name}`);
        console.log(`Age: ${currentSentence.age}`);
        console.log(`Date: ${currentSentence.date}`);
    }
}
ParseJSONOBjects(['{"name":"Gosho","age":10,"date":"19/06/2005"}', '{"name":"Tosho","age":11,"date":"04/04/2005"}'])