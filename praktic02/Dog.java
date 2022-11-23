package praktic02;

public class Dog extends Animal implements SpeakAble, RunAble {

    public Dog(String name, String breed, String colour, Integer countLegs, Integer age) {
        super(name, breed, colour, countLegs, age);

    }

    @Override
    public String speak() {

        return "Р-р-р-р! Гаф!";
    }

    @Override
    public String run() {
        return "40 км/ч";
    }

}
