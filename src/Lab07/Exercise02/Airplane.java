package Lab07.Exercise02;

public class Airplane {

    private Wing a;

    static private class Wing {
        private double wingWeight;

        public Wing(double wingWeight) {
            this.wingWeight = wingWeight;
        }

        public void outPutWeight() {
            System.out.println(wingWeight);
        }
    }

    public void createWing(double weight) {
        this.a = new Wing(weight);
    }

    public void outPut(){
        a.outPutWeight();
    }
}
