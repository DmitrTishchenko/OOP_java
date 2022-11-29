package praktic03;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        User bigBoss = new User("Царь", "Леонтий", 32);
        User littleBoss = new User("Маленький", "Начальник", 33);
        List<User> users = Arrays.asList(new User[] { new User("Петр", "Иванов", 32),
                new User("Иван", "Петров", 21),
                new User("Федор", "Тютин", 44),
                new User("Петр", "Aванов", 33) });
        Personal personal1 = new Personal(users);
        for (User user : personal1) {
            System.out.println(user);
        }
        Collections.sort(users);
        System.out.println(users);
        Company company = new Company(bigBoss);
        littleBoss.setSubordinates(users);
        bigBoss.setSubordinates(Arrays.asList(littleBoss));
        for (User user : company) {
            System.out.println(user);

        }

    }

}