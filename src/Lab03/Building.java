package Lab03;

public class Building {
    private String name;
    private Integer year;
    private Integer floors;

    public Building() {
    }

    public Building(String name) {
        this.name = name;
    }

    public Building(String name, Integer year, Integer floors) {
        this.name = name;
        this.year = year;
        this.floors = floors;
    }

    public String toString() {
        return "Building{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", floors=" + floors +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getFloors() {
        return floors;
    }

    public void setFloors(Integer floors) {
        this.floors = floors;
    }
}
