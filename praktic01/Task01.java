package praktic01;

public class Task01 {
    public static void main(String[] args) {
        Product prod = new Product("Чипсы", 60.0);

        System.out.printf("%s %,.2f\n", prod.getName(), prod.getPrice());

    }
}
