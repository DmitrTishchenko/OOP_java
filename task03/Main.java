package task03;

public class Main {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        CustomList<User> cl = new CustomList<>();
        cl.add(new User("Иван", "Иванов", 22));
        cl.add(new User("Александр", "Тимохин", 18));
        cl.add(new User("Петр", "Великий", 50));
        for (Node node : cl) {
            System.out.println(node.getData());
        }
    }
}
