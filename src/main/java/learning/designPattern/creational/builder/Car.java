package learning.designPattern.creational.builder;

public class Car {
    private int number;
    private String name;
    private String color;

    private Car(int number, String name, String color) {
        this.number = number;
        this.name = name;
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public static class CarBuilder {
        private int number;
        private String name;
        private String color;

        public CarBuilder setNumber(int number) {
            this.number = number;
            return this;
        }

        public CarBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public Car build() {
            return new Car(number, name, color);
        }
    }
}
