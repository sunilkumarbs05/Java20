package learning.designPattern.behavioral.command;

public class RaiseOneHandCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Raise one hand command executed");
    }
}
