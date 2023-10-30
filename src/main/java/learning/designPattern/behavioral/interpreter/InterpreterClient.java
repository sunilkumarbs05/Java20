package learning.designPattern.behavioral.interpreter;

import learning.designPattern.behavioral.interpreter.expression.SubstractionExpression;
import learning.designPattern.behavioral.interpreter.engine.InterpreterEngine;
import learning.designPattern.behavioral.interpreter.expression.AdditionExpression;
import learning.designPattern.behavioral.interpreter.expression.Expression;

public class InterpreterClient {
    private InterpreterEngine interpreterEngine;

    public InterpreterClient(InterpreterEngine interpreterEngine) {
        this.interpreterEngine = interpreterEngine;
    }

    public int interpreter(String input) {
        Expression expression = null;
        if (input.contains("add")) {
            expression = new AdditionExpression(input);
        } else if (input.contains("sub")) {
            expression = new SubstractionExpression(input);
        } else {
            throw new RuntimeException("input is invalid");
        }
        int result = expression.interpret(interpreterEngine);
        return result;
    }
}
