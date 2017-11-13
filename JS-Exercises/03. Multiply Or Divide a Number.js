function MultiplyOrDivide(arr) {
    let n = arr[0];
    let m = arr[1];

   if (m >= n){
        n *= m;
    } else {
        n /= m;
    }

    console.log(n);
}
MultiplyOrDivide(['13', '13'])