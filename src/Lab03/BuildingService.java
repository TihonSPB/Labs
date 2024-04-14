package Lab03;

import java.util.Calendar;

public class BuildingService {
    public static String AgeOfTheBuilding(Building building) {
        if (building.getYear() == null) {
            return "Возраст здания определить невозможно.";
        }

        Calendar calendar = Calendar.getInstance();
        Integer AgeBuild = calendar.get(Calendar.YEAR) - building.getYear();

        return "Возраст здания \"" + building.getName() + "\": " + AgeBuild;
    }
}
