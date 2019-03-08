package decoupled;

public class Car implements Vehicle {
    private Whell whell;

    public void setWhell(Whell whell) {

        this.whell=whell;
    }

    public void goAhead() {

        whell.turnWhell();
    }
}
