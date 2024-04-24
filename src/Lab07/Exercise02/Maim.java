package Lab07.Exercise02;

public class Maim {
    public static void main(String[] args) {

        Airplane a = new Airplane();
        a.createWing(25);

        Airplane b = new Airplane();
        b.createWing(30);

        a.outPut();
        b.outPut();
    }
}
