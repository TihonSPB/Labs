package Lab03;

public class Main {
    public static void main(String[] args) {
        //Exercise 01
        Study study = new Study("Изучение Java - это просто!");

        System.out.println(study.printCourse());

        //Exercise 02
        Car car1 = new Car();
        Car car2 = new Car("Mitsuoka", "white", 160);

        System.out.println(car1.printCar());
        System.out.println(car2.printCar());

        //Exercise 03
        Building building1 = new Building();
        building1.setName("Московский Кремль");
        building1.setFloors(10);

        Building building2 = new Building("Зимний дворец", 1762, 3);

        System.out.println(building1);
        System.out.println(BuildingService.AgeOfTheBuilding(building1));
        System.out.println(building2);
        System.out.println(BuildingService.AgeOfTheBuilding(building2));

        //Exercise 04
        Tree tree1 = new Tree();
        Tree tree2 = new Tree(50, "Дуб");
        Tree tree3 = new Tree(20, true, "Баобаб");

        System.out.println(tree1);
        System.out.println(tree2);
        System.out.println(tree3);
    }
}
