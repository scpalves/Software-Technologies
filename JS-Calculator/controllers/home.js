const Calculator = require('../models/Calculator')

module.exports = {
    indexGet: (req, res) => {
        res.render('home/index');
    },
    indexPost: (req, res) => {
        let calculatorBody = req.body['calculator'];

        let calculator = new Calculator();
        calculator.leftOperand = Number(calculatorBody.leftOperand);
        calculator.operator = calculatorBody.operator;
        calculator.rightOperand = Number(calculatorBody.rightOperand);

        let result = calculator.calculateResult();

        res.render('home/index', {'calculator': calculator, 'result': result})
    }
};