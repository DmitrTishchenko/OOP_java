package praktic02;

public class Cat extends Animal implements SpeakAble, RunAble {

    public Cat(String name, String breed, String colour, Integer countLegs, Integer age) {
        super(name, breed, colour, countLegs, age);

    }

    @Override
    public String speak() {
        return "Мяу мур-р-р-р!";
    }

    @Override
    public String run() {
        return "10 км/ч";
    }

}
