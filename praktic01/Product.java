package praktic01;

public class Product {
    private String name;
    protected Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public Product(String name2) {
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(double value) {
        if (value <= 0) {
            return;
        }
        this.price = value;

    }

    @Override
    public String toString() {
        return String.format("Название: %s Цена: %,.2f", this.name, this.price);
    }
}