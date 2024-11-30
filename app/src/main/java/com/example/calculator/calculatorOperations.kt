package com.example.calculator

sealed class calculatorOperations(val symbol: String) {
    object Add:calculatorOperations("+")
    object Subtract:calculatorOperations("-")
    object Multiply:calculatorOperations("x")
    object Divide:calculatorOperations("/")
    object Percentage:calculatorOperations("%")
}