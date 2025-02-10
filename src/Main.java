public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

class Car {
    private String marka;

    public Car(String marka, double maxSpeed) {
        this.marka = marka;
        this.maxSpeed = maxSpeed;
    }

    public Car(String marka) {
        this.marka = marka;
    }

    private double maxSpeed = 220;

    public void getSpeedOneHundred() {
        double tmp = 110 / (this.maxSpeed / 20);
        System.out.printf("Скорость разгона до 100км/ч : %s\n", tmp);
    }

    public String getMarka() {
        return marka;
    }
}

class Another {
    public static void main(String[] args) {
        Car car1 = new Car("Zvor");
        Car car2 = new Car("Sup", 400);


        Garazh garazh = new Garazh();
        garazh.setCar1(car1);
        garazh.setCar2(car2);
        garazh.getInfoAboutCars();


    }
}
class Garazh{
    private Car car1;
    private Car car2;
    public Garazh(){}


    public void setCar1(Car car1) {
        this.car1 = car1;
    }

    public void setCar2(Car car2) {
        this.car2 = car2;
    }
    public void getInfoAboutCars(){
        printInfoAboutCars(car1);
        printInfoAboutCars(car2);
    }

    public void printInfoAboutCars(Car car){
        System.out.println(car.getMarka());
        car.getSpeedOneHundred();
    }

}
