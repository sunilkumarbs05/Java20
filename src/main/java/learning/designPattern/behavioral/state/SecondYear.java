package learning.designPattern.behavioral.state;

public class SecondYear implements KidBehavior {
    @Override
    public void play() {
        System.out.println("Play with toys");
    }

    @Override
    public void eat() {
        System.out.println("Eat fruits and drink milk");
    }
}
