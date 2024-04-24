package Lab06.Exercise01;

public class BankEmployee extends Human {

    private String bankName;

    public BankEmployee(String name, String surname, String bankName) {
        super(name, surname);
        this.bankName = bankName;
    }

    @Override
    public void informationOutput() {
        System.out.println(
                "Bank employee name: " + getName() + "\nBank employee's last name: " + getSurname() + "\nBank's name: " + bankName
        );
    }
}
