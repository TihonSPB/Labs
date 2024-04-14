package Lab03;

public class Tree {
    private Integer year;
    private Boolean alive;
    private String name;

    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }

    public Tree(Integer year, String name) {
        this.year = year;
        this.name = name;
    }

    public Tree(Integer year, Boolean alive, String name) {
        this.year = year;
        this.alive = alive;
        this.name = name;
    }

    public String toString() {
        return "Tree{" +
                "year=" + year +
                ", alive=" + alive +
                ", name='" + name + '\'' +
                '}';
    }
}
