package Lab06.Exercise01;

public abstract class Human {

    private String name;
    private String surname;

    public Human() {
    }

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public abstract void informationOutput();
}
