package Lab02.Exercise02;

public class Person {
    private String name;
    private Integer age;
    private Integer weight;
    private Double height;
    private Gender gender;
    private Status status;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, Integer age, Integer weight, Double height, Gender gender, Status status) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.gender = gender;
        this.status = status;
    }

    public String toString() {
        return "Человек{" +
                "Имя='" + name + '\'' +
                ", Возраст=" + age +
                ", Вес=" + weight +
                ", Рост=" + height +
                ", Пол=" + gender +
                ", Семейный статус=" + status.getDescription() +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }


}
