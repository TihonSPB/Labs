package Lab09;

import java.util.*;

public class ListService {

    //проверка списка
    private static boolean checkList(List<?> l) {
        if (l != null && !l.isEmpty()) {
            return true;
        }
        System.out.println("Список пуст!");
        return false;
    }

    // 2
    public static List<Object> removingDuplicateObjects(List<Object> obj) {

        if (!checkList(obj)) {
            return obj;
        }

        Set<Object> a = new LinkedHashSet<>(obj);
        obj = new ArrayList<>(a);

        return obj;
    }

    public static List<Object> createTestObjectList(int quantity) {
        List<Object> a = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            Object r = new TestObject();
            a.add(r);
        }
        return a;
    }

    public static void outPutObjectList(List<Object> obj) {

        if (!checkList(obj)) {
            return;
        }

        for (Object i : obj) {
            TestObject a = (TestObject) i;
            a.outPutObject();
        }
        System.out.println("_________________");
    }

    // 3
    public static List<Integer> createIntegerList(int quantity, boolean linkedList) {

        List<Integer> a;

        if (linkedList) {
            a = new LinkedList<>();
        } else {
            a = new ArrayList<>();
        }
        for (int i = 0; i < quantity; i++) {
            a.add(i + 1);
        }
        return a;
    }

    public static void outPutList(List<?> l) {

        if (!checkList(l)) {
            return;
        }

        for (int i = 0; i < l.size(); i++) {
            System.out.print(l.get(i));
            if (i != l.size() - 1) {
                System.out.print("; ");
            }
        }
        System.out.println(".");
    }

    public static void outPutRandomListElements(int quantity, List<?> l) {

        if (!checkList(l)) {
            return;
        }

        for (int i = 0; i < quantity; i++) {
            int r = RandomService.randomInteger(0, l.size());
            System.out.print(l.get(r));
            if (i != quantity - 1) {
                System.out.print("; ");
            }
        }
        System.out.println(".");
    }

    // 4
    public static Map<User, Integer> createUsersMap(int quantity) {
        Map<User, Integer> users = new HashMap<>();
        for (int i = 0; i < quantity; i++) {
            String name = RandomService.randomNameMan();
            Integer score = RandomService.randomInteger(1, 10);

            User u = new User(name);
            users.put(u, score);
        }
        System.out.println("Созданно " + users.size() + " пользователей.");
        return users;
    }

    public static void outPutScoreUserMap(Map<User, Integer> users) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = scanner.next();

        for (Map.Entry<User, Integer> entry : users.entrySet()) {
            User key = entry.getKey();
            Integer value = entry.getValue();

            if (name.equals(key.getName())) {
                System.out.println("Количество очков: " + value);
                return;
            }
        }
        System.out.println("Нет такого пользователя.");
    }
}


