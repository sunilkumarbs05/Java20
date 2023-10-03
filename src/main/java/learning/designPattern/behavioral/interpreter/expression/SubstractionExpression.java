package learning.designPattern.behavioral.interpreter.expression;

import learning.designPattern.behavioral.interpreter.engine.InterpreterEngine;

public class SubstractionExpression implements Expression{
   private String expression;

    public SubstractionExpression(String expression) {
        this.expression = expression;
    }

    @Override
    public int interpret(InterpreterEngine interpreterEngine) {
        return interpreterEngine.substraction(expression);
    }
}
