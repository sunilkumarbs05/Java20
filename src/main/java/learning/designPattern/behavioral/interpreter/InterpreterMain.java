package learning.designPattern.behavioral.interpreter;

import learning.designPattern.behavioral.interpreter.engine.InterpreterEngine;

public class InterpreterMain {
    public static void main(String[] args) {
        InterpreterEngine interpreterEngine = new InterpreterEngine();
        InterpreterClient interpreterClient = new InterpreterClient(interpreterEngine);
        System.out.println(interpreterClient.interpreter("Add 10 and 20"));
        System.out.println(interpreterClient.interpreter("Sub 10 to 20"));
    }
}
