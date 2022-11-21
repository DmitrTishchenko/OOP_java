package praktic01;

public class Chocolate extends Product {
    Double calories;

    public Chocolate(String name) {
        super(name);
    }

    public Chocolate(String name, Double price) {
        super(name, price);
    }

    public Chocolate(String name, Double price, Double calories) {
        super(name, price);
        this.calories = calories;
    }

    public Double getCalories() {
        return this.calories;
    }

    @Override
    public String toString() {
        return String.format("%s Коллорийность: %,.2f", super.toString(), getCalories());
    }

}
