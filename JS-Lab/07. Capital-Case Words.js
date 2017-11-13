function capitalCaseWords (words) {
    words = words
        .join('')
        .split(/\W+/)
        .filter(w => w.length > 0)
        .filter(w => w === w.toUpperCase())
        .join(', ');

    console.log(words);
}
capitalCaseWords(['We start by HTML, CSS, JavaScript, JSON and REST.', 'Later we touch some PHP, MySQL and SQL.'])