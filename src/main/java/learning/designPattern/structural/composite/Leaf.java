package learning.designPattern.structural.composite;

public class Leaf implements Component {
    public String name;
    private int price;

    public Leaf(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void showPrice() {
        System.out.println("Name: %s , price: %d".formatted(name, price));
    }
}