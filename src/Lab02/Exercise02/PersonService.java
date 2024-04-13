package Lab02.Exercise02;

public class PersonService {
    public static String BodyMassIndex(Person person) {
        if (person.getWeight() == null || person.getHeight() == null) {
            return "Недостаточно информации о " + person.getName();
        }

        double indexBM = (double) person.getWeight() / (person.getHeight() * person.getHeight());

        if (indexBM < 25) {
            if (indexBM >= 18.5) {
                return "ИМТ=" + indexBM + ". Норма";
            } else if (indexBM >= 16) {
                return "ИМТ=" + indexBM + ". Недостаточная (дефицит) масса тела";
            } else {
                return "ИМТ=" + indexBM + ". Выраженный дефицит массы тела";
            }
        } else {
            if (indexBM <= 30) {
                return "ИМТ=" + indexBM + ". Избыточная масса тела (предожирение)";
            } else if (indexBM <= 35) {
                return "ИМТ=" + indexBM + ". Ожирение 1 степени";
            } else if (indexBM <= 40) {
                return "ИМТ=" + indexBM + ". Ожирение 2 степени";
            } else {
                return "ИМТ=" + indexBM + ". Ожирение 3 степени";
            }
        }
    }
}
