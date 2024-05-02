package Lab09;

public class TestObject {

    private static Integer amount = 1;

    private final Integer serialNumber;
    private final String name;
    private final String str;
    private final Integer number;
    private final boolean bol;

    public TestObject() {
        this.serialNumber = amount++;
        this.name = RandomService.randomNameMan();
        this.str = RandomService.randomString();
        this.number = RandomService.randomInteger(-500, 500);
        this.bol = RandomService.randomBoolean();
    }

    public void outPutObject() {
        System.out.println("Serial number: " + serialNumber + "; Name: " + name + "; String: " + str + "; Number: " + number + "; Boolean: " + bol);
    }
}
