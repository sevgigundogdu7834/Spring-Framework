package bean_Factory;

public class Test {

    public static void main(String[] args) {

        Wheel lassa =new Lassa();
        Car car=new Car();
        car.setWheel(lassa);
        car.drive();
    }
}
