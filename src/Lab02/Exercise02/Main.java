package Lab02.Exercise02;

public class Main {
    public static void main(String[] args) {
        Person user1 = new Person("Jane");
        user1.setAge(25);
        user1.setStatus(Status.SINGLE);
        user1.setGender(Gender.FEMALE);
        user1.setWeight(65);

        System.out.println(user1);
        System.out.println(user1.getName());
        System.out.println(user1.getStatus().getDescription());
        System.out.println(PersonService.BodyMassIndex(user1));

        Person user2 = new Person("Jon", 35, 92, 1.83, Gender.MALE, Status.MARRIED);

        System.out.println(user2);
        System.out.println(PersonService.BodyMassIndex(user2));
    }
}
