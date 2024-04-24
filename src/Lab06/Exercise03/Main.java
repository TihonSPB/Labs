package Lab06.Exercise03;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(645, "Lada (ВАЗ) 1111 Ока", 'w', 130);
        car1.outPut();
        Truck car2 = new Truck(18000, "MAN TGA", 'r', 210, 6, 50000);
        car2.changeTheNumberOfWheels(8);
        car2.outPut();
    }
}
