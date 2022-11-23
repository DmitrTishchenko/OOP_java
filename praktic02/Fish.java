package praktic02;

public class Fish extends Animal implements SpeedRunAble {

    public Fish(String name, String breed, String colour, Integer countLegs, Integer age) {
        super(name, breed, colour, countLegs, age);

    }

    @Override
    public String speedRun() {

        return "97 км/ч";
    }

}
