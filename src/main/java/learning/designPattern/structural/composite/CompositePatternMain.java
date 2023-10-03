package learning.designPattern.structural.composite;

public class CompositePatternMain {
    public static void main(String[] args) {
        Component mouse = new Leaf("Mouse", 100);
        Component keyboard = new Leaf("Keyboard", 200);
        Component hd = new Leaf("Hard disk", 300);
        Component cpu = new Leaf("CPU", 400);
        Component ram = new Leaf("RAM", 600);

        Composite peri = new Composite("Peri");
        peri.addComponent(mouse);
        peri.addComponent(keyboard);

//        Composite peri = new Composite("");


        Composite computer = new Composite("Computer");
        computer.addComponent(peri);

        computer.showPrice();


    }
}
