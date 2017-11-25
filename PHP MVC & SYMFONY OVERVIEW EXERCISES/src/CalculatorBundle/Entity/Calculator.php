<?php

namespace CalculatorBundle\Entity;

class Calculator
{
    /**
     * @var float
     */

    private $leftOperand;

    /**
     * @var float
     */

    private $rightOperand;

    /**
     * @var string
     */

    private $operator;

    /**
     * Get Left operand
     *
     * @return float
     */

    public function getLeftOperand(){
        return $this->leftOperand;
    }

    /**
     * Set Left operand
     *
     * @param float $operand
     *
     * @return Calculator
     */

    public function setLeftOperand($operand){
        $this->leftOperand = $operand;

        return $this;
    }

    /**
     * Get Right operand
     *
     * @return float
     */

    public function getRightOperand(){
        return $this->rightOperand;
    }

    /**
     * Set Right operand
     *
     * @param float $operand
     *
     * @return Calculator
     */

    public function setRightOperand($operand){
        $this->rightOperand = $operand;

        return $this;
    }

    /**
     * Get operator
     *
     * @return float
     */

    public function getOperator(){
        return $this->operator;
    }

    /**
     * Set operator
     *
     * @param string $operator
     *
     * @return Calculator
     */

    public function setOperator($operator){
        $this->operator = $operator;

        return $this;
    }
}