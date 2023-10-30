package learning.designPattern.creational.prototype;

public class Car implements Cloneable {
    private int id;
    private String name;
    private String color;

    public Car() {
    }

    public Car(int id, String name, String color) {
        this.id = id;
        this.name = name;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        return new Car(this.id, this.name, this.color);
    }
}
