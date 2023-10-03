package learning.designPattern.behavioral.interpreter.expression;

import learning.designPattern.behavioral.interpreter.engine.InterpreterEngine;

public interface Expression {
    int interpret(InterpreterEngine interpreterEngine);
}
