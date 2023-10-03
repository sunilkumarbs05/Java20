package learning.designPattern.behavioral.interpreter.expression;

import learning.designPattern.behavioral.interpreter.engine.InterpreterEngine;

public class AdditionExpression implements Expression{
    private String expression;

    public AdditionExpression(String expression) {
        this.expression = expression;
    }

    @Override
    public int interpret(InterpreterEngine interpreterEngine) {
        return interpreterEngine.addition(expression);
    }
}
