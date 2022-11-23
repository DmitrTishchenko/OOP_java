package praktic02;

public class Dolphin extends Animal implements SpeedRunAble {

    public Dolphin(String name, String breed, String colour, Integer countLegs, Integer age) {
        super(name, breed, colour, countLegs, age);

    }

    @Override
    public String speedRun() {

        return "40 км/ч";
    }

}
