package learning.designPattern.behavioral.command;

public class HandsDownCommand implements Command{
    @Override
    public void execute() {
        System.out.println("Hands down command executed");
    }
}
