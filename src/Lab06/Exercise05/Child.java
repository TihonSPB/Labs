package Lab06.Exercise05;

public class Child extends Parent {

    protected String name;

    @Override
    public void inPut() {
        System.out.print("Введите имя: ");
        this.name = scanner.next();

        super.inPut();
    }

    public void outPut() {
        System.out.println("Имя: " + name + "\nВозраст: " + age);
    }
}
