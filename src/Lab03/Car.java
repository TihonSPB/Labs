package Lab03;

public class Car {
    private String color;
    private String name;
    private Integer weight;

    public Car() {
    }

    public Car(String name) {
        this.name = name;
    }

    public Car(String color, Integer weight) {
        this.color = color;
        this.weight = weight;
    }

    public Car(String name, String color, Integer weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    public String printCar() {
        return "Машина: " + name + ", цвет " + color + ", вес " + weight + '.';
    }
}
