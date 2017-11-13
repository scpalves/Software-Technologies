function PrintLines(args) {
    for(let i = 0; i < args.length; i++){
        if (args[i] === 'Stop'){
            return;
        }
        console.log(args[i]);
    }
}
