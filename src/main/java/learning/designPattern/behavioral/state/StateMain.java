package learning.designPattern.behavioral.state;

public class StateMain {
    public static void main(String[] args) {
        Kid kid;
        for (int i = 1; i < 4; i++) {
            kid = new Kid(i);
            kid.play();
            kid.eat();
            System.out.println("--------------------------");
        }
    }
}
