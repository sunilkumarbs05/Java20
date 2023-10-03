package learning.designPattern.behavioral.state;

public class FirstYearKid implements KidBehavior{

    @Override
    public void play() {
        System.out.println("Play in cradle");
    }

    @Override
    public void eat() {
        System.out.println("Drink Milk");
    }
}
