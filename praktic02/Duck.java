package praktic02;

public class Duck extends Animal implements FlyAble, RunAble, SpeakAble {

    public Duck(String name, String breed, String colour, Integer countLegs, Integer age) {
        super(name, breed, colour, countLegs, age);

    }

    @Override
    public String fly() {

        return "90 km/ч";
    }

    @Override
    public String run() {

        return "2 км/ч";
    }

    @Override
    public String speak() {

        return "Зак-зак!";
    }

}
