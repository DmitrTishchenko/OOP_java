package praktic01;

import java.util.ArrayList;
import java.util.List;

public class Task01 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        List<Product> prods = new ArrayList<>();
        prods.add(new Eco("Йогурт", 200.0, "Эко"));
        prods.add(new Eco("Биойогурт", 100.0, "Био"));
        prods.add(new Milk("Петмол", 60.0, 5));
        prods.add(new Chocolate("Milka", 88.0, 303.0));
        prods.add(new Chocolate("Snikers", 90.0, 401.0));
        prods.add(new Product("Чипсы", 60.0));
        prods.add(new Product("Масло", 50.0));
        prods.add(new Product("Хлеб", 40.0));
        prods.add(new Product("Снек", 20.0));
        VendingMachine v1 = new VendingMachine(prods);
        System.out.println(v1);
        System.out.println(v1.getProductBy("Масло"));
        System.out.println(v1.getProductBy("Milka"));
        System.out.println(v1.getProductBy("Йогурт"));

    }

}