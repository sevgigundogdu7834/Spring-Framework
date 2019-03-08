package constructor_İnjection;

import com.sun.tools.classfile.Dependency;

public class Constructorinjection {

    private Dependency dependency;

    public Constructorinjection(Dependency dependency) {
        this.dependency = dependency;
    }

    @Override
    public String toString() {

        return dependency.toString();
    }
}
