function ReversedOrderNumbers(args) {
    args = args.map(Number);

    for(let i = args.length - 1; i >= 0; i--){
        console.log(args[i]);
    }
}
ReversedOrderNumbers(['10','15','20'])
