package learning.designPattern.behavioral.state;

public class ThirdYearKid implements KidBehavior{
    @Override
    public void play() {
        System.out.println("Run and roll");
    }

    @Override
    public void eat() {
        System.out.println("Eat fruits and chocolates");
    }
}
