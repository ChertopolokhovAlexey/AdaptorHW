package org.example;

public class IntsCalculator implements Ints{
    Calculator calc = new Calculator();
    @Override
    public double sum(double arg0,double arg1) {
         return  calc.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.SUM)
                .result();
    }

    @Override
    public double mult(double arg0, double arg1) {
        return calc.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.MULT)
                .result();
    }

    @Override
    public double pow(double arg0, double arg1) {
        return calc.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.POW)
                .result();
    }
}
