package praktik04;

public class Main {
    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");
        Hero hero1 = new Hero("Мощный", 1200, new Staff(), new BigShield());
        Hero hero2 = new Hero("Лютый", 1500, new Staff(), new BigShield());

        Team<Archer> megaTeam = new Team<Archer>(hero1);
        Archer a1 = new Archer("МеткийПоц", 800, new Bow(), new LittleShield(), 100);
        Archer a2 = new Archer("МеткийБро", 800, new Bow(), new LittleShield(), 100);
        megaTeam.add(a1);
        megaTeam.add(a2);

        Team<Mage> magicCommand = new Team<Mage>(hero2);
        magicCommand.add(new Mage("ГендальфСерый", new Staff(), 580, 200, 3000));
        magicCommand.add(new Mage("Маг с щитом", new Staff(), 570, 180, 2300, new AverageShield()));

        Team<Warrior> redTeam = new Team<>(hero1);
        redTeam.add(new Mage("ГендальфСерый", new Staff(), 580, 200, 3000));
        redTeam.add(new Archer("МеткийБро", 800, new Bow(), new LittleShield(), 100));

        System.out.println(redTeam);
        System.out.println("---------");
        System.out.println(megaTeam);
        System.out.println("--------");
        System.out.println(magicCommand);
        System.out.println("--------------------------------");
        System.out.println(redTeam.getTeamHealthPoint());

    }

}
