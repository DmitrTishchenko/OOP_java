package praktik04;

public class Main {
    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");
        Hero hero1 = new Hero("Мощный", new Staff(), 1500);
        Team<Archer> team1 = new Team<>(hero1);
        team1.add(new Archer("Великий", new Bow(), 1750, 10));
        team1.add(new Archer("Брат Великого", new Bow(), 1750, 10));

        Team<Warrior> team2 = new Team<>(hero1);
        team2.add(new Archer("Легалаз", new Bow(), 1000, 27));
        team2.add(new Archer("Альстред", new Bow(), 980, 27));
        for (Warrior item : team1) {
            System.out.println(item);
        }
        System.out.println(team2);
    }

}
