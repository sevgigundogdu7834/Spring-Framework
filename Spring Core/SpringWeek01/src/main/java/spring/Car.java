package spring;

public class Car implements Vehicle {

    private Wheel wheel;

    public void setWheel(Wheel wheel) {

        this.wheel=wheel;

    }

    public void drive() {

       wheel.turnWheel();
    }
}
