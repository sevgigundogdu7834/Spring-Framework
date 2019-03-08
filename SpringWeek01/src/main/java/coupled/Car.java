package coupled;

public class Car {

    private Tire tire;

    public Car() {

        tire=new Tire();  // birbirlerine göbekten bağlılar

        // istenen durum loose coupling
    }

    public void drive(){

        System.out.println("drive...");
        tire.turn_tire();
    }
}
