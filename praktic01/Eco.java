package praktic01;

public class Eco extends Product {
    String ecolog;

    public Eco(String name) {
        super(name);

    }

    public Eco(String name, Double price) {
        super(name, price);
    }

    public Eco(String name, Double price, String ecolog) {
        super(name, price);
        this.ecolog = ecolog;
    }

    public String getEcolog() {
        return this.ecolog;
    }

    @Override
    public String toString() {
        return String.format("%s %s", super.toString(), getEcolog());
    }

}
