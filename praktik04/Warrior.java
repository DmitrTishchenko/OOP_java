package praktik04;

public abstract class Warrior {
    private String name;
    private Weapon weapon;
    private Integer healthPoint;

    public Warrior(String name, Weapon weapon, Integer healthPoint) {
        this.name = name;
        this.weapon = weapon;
        this.healthPoint = healthPoint;
    }

    public String getName() {
        return name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public Integer getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(Integer healthPoint) {
        this.healthPoint = healthPoint;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d", name, weapon, healthPoint);
    }
}