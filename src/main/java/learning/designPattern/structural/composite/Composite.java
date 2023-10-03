package learning.designPattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
    private String name;
    private List<Component> list = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }

    public void addComponent(Component component) {
        list.add(component);
    }

    @Override
    public void showPrice() {
        System.out.println("Name: %s".formatted(name));
        for (Component component : list) {
            component.showPrice();
        }
    }
}
