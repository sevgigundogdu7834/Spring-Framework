package constructor_İnjection;

public class ConstructorConfuse {

    private String strProperty;
    private int intProperty;

    public ConstructorConfuse(String strProperty) {
        this.strProperty = strProperty;
        System.out.println("String Confuse");
    }

    public ConstructorConfuse(int intProperty) {
        this.intProperty = intProperty;
        System.out.println("İnteger Confuse");
    }

    @Override
    public String toString() {
        return "ConstructorConfuse{" +
                "strProperty='" + strProperty + '\'' +
                ", intProperty=" + intProperty +
                '}';
    }
}
