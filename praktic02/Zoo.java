package praktic02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zoo {
    private List<Animal> animals;

    public Zoo() {
        animals = new ArrayList<>(Arrays.asList(new Cat("Барсик", "Вислоухий", "Серый", 4, 6),
                new Dog("Мотя", "Питбуль", "Белый", 4, 2),
                new Fish("Зубастик", "Планктон", "Прозрачный", 0, 11),
                new Duck("Дональд", "Махнаног", "Белый", 2, 1),
                new Dolphin("Крассавчик", "Афалина", "Серый", 0, 3)));
    }

    public void talk() {
        for (SpeakAble item : getSpeakAble()) {
            System.out.printf("сказали нам %s\n", item.speak());

        }
    }

    public List<SpeakAble> getSpeakAble() {
        List<SpeakAble> result = new ArrayList<>();
        for (Animal speakItem : animals) {
            if (speakItem instanceof SpeakAble) {
                result.add((SpeakAble) (speakItem));
            }
        }
        result.add(new Radio());
        return result;
    }

    public List<RunAble> getRunAble() {
        List<RunAble> result = new ArrayList<>();
        for (Animal speakItem : animals) {
            if (speakItem instanceof RunAble) {
                result.add((RunAble) (speakItem));
            }
        }

        return result;
    }

    public List<FlyAble> getFlyAble() {
        List<FlyAble> result = new ArrayList<>();
        for (Animal speakItem : animals) {
            if (speakItem instanceof FlyAble) {
                result.add((FlyAble) (speakItem));
            }
        }
        return result;
    }

    public void run() {
        for (RunAble item : getRunAble()) {
            System.out.printf("Бежит: %s %s\n", item.toString(), item.run());

        }
    }

    public void fly() {
        for (FlyAble item : getFlyAble()) {
            System.out.printf("Летит: %s %s\n", item.toString(), item.fly());

        }
    }

    public List<SpeedRunAble> getSpeedRunAble() {
        List<SpeedRunAble> result = new ArrayList<>();
        for (Animal speakItem : animals) {
            if (speakItem instanceof SpeedRunAble) {
                result.add((SpeedRunAble) (speakItem));
            }
        }
        return result;
    }

    public void speedRun() {
        for (SpeedRunAble item : getSpeedRunAble()) {
            System.out.printf("Плывет: %s со скоростью: %s\n", item.toString(), item.speedRun());

        }
    }
}
