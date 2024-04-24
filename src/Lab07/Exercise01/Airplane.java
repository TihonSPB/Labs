package Lab07.Exercise01;

public class Airplane {
    static class Wing {

        private double wingWeight;

        public Wing(double wingWeight) {
            this.wingWeight = wingWeight;
        }

        public void outPutWeight(){
            System.out.println(wingWeight);
        }
    }
}
