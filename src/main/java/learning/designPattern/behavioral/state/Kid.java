package learning.designPattern.behavioral.state;

public class Kid {
    private  int age;
    private KidBehavior kidBehavior;

    public Kid(int age) {
        setAge(age);
    }

    public void play() {
        kidBehavior.play();
    }

    public void eat() {
        kidBehavior.eat();;
    }

    private void setAge(int age){
        this.age = age;
        switch (age){
            case 1 -> kidBehavior = new FirstYearKid();
            case 2 -> kidBehavior = new SecondYear();
            case 3 -> kidBehavior = new ThirdYearKid();
        }
    }

}
