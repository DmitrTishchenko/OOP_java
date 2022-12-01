package praktik04;

public class Archer extends Warrior {
    private Integer range;

    public Archer(String name, Bow weapon, Integer healthPoint, Integer range) {
        super(name, weapon, healthPoint);
        this.range = range;
    }

    public Integer getRange() {
        return range;
    }

    @Override
    public String toString() {
        return String.format("Archer: %s range: %d", super.toString(), range);
    }

}
