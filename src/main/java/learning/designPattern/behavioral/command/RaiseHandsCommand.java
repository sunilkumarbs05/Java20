package learning.designPattern.behavioral.command;

public class RaiseHandsCommand implements Command{
    @Override
    public void execute() {
        System.out.println("Raise Hands Command executed");
    }
}
