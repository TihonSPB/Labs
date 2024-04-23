package Lab06.Exercise01;

public class Client extends Human {

    private String bankName;

    public Client(String name, String surname, String bankName) {
        super(name, surname);
        this.bankName = bankName;
    }

    @Override
    public void informationOutput() {
        System.out.println(
                "Сlient name: " + getName() + "\nClient's last name: " + getSurname() + "\nBank's name: " + bankName
        );
    }
}
