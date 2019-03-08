package spring;

public interface Wheel {

    // büyük projelerde bağlılık/bağımlılıktan doğacak problemlerden dolayı nesneler/objeleri bağımsız hale
    // getirmek için decoupled dan faydalanırız.
    // Decoupled için interfacelerden faydalanırız.

    public void turnWheel();
}
