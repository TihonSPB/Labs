package Lab06.Exercise03;

public class Truck extends Car {

    private int numberOfWheels;
    private float weightLimit;

    public Truck(int w, String m, char c, float s, int numberOfWheels, float weightLimit) {
        super(w, m, c, s);
        this.numberOfWheels = numberOfWheels;
        this.weightLimit = weightLimit;
    }

    public void changeTheNumberOfWheels(int newWheels) {
        this.numberOfWheels = newWheels;
        System.out.println("Новое количество колес у " + model + " = " + numberOfWheels);
    }

    @Override
    public void outPut() {
        System.out.println("Вес " + model + " составляет " + weight + "кг.");
        System.out.println("Цвет машины - " + color + " и её скорость - " + speed);
        System.out.println("Количество колес - " + numberOfWheels + ", полная масса составляет " + weightLimit + "кг.");
    }
}
