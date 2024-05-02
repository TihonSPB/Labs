package Lab09;

import java.time.Duration;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        // 2
        List<Object> objects = ListService.createTestObjectList(5);
        ListService.outPutObjectList(objects);

        objects.add(2, objects.get(1));
        objects.add(0, objects.get(4));
        ListService.outPutObjectList(objects);

        objects = ListService.removingDuplicateObjects(objects);
        ListService.outPutObjectList(objects);

        // 3
        int amountOfElements = 1000000;
        int choices = 100000;

        List<Integer> arList = ListService.createIntegerList(amountOfElements, false);
        java.time.LocalTime startArrayList = java.time.LocalTime.now();
        //ListService.outPutList(arList);
        ListService.outPutRandomListElements(choices, arList);
        java.time.LocalTime endArrayList = java.time.LocalTime.now();

        LinkedList<Integer> linList = (LinkedList<Integer>) ListService.createIntegerList(amountOfElements, true);
        java.time.LocalTime startLinkedList = java.time.LocalTime.now();
        //ListService.outPutList(linList);
        ListService.outPutRandomListElements(choices, linList);
        java.time.LocalTime endLinkedList = java.time.LocalTime.now();

        Duration durationA = Duration.between(startArrayList, endArrayList);
        Duration durationL = Duration.between(startLinkedList, endLinkedList);

        System.out.println("Время, потраченное на выбор в ArrayList: " + durationA.toMinutes() % 60 + "мин. " + durationA.toSeconds() % 60 + "сек. " + durationA.toMillis() % 1000 + "мс.");
        System.out.println("Время, потраченное на выбор в LinkedList: " + durationL.toMinutes() % 60 + "мин. " + durationL.toSeconds() % 60 + "сек. " + durationL.toMillis() % 1000 + "мс.");

        // 4
        Map<User, Integer> users = ListService.createUsersMap(40);

        System.out.println(users);

        ListService.outPutScoreUserMap(users);
    }
}
