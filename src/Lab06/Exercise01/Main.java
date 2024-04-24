package Lab06.Exercise01;

public class Main {
    public static void main(String[] args) {

        Human user1 = new Client("Вася", "Пупкин", "Сберкасса №5");
        Client user2 = new Client("Иван", "Иванов", "РосМинХозСельпоБанк");
        BankEmployee user3 = new BankEmployee("Роман", "Фунт", "Рога и копыта банкъ");

        user1.informationOutput();
        user2.informationOutput();
        user3.informationOutput();
    }
}
