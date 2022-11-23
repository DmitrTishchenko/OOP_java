package praktic02;

public class Main {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        Zoo zoo = new Zoo();
        zoo.talk();
        System.out.println("--------------------------------");
        zoo.run();
        System.out.println("--------------------------------");
        zoo.fly();
        System.out.println("--------------ДЗ----------------");
        zoo.speedRun();
    }
}
