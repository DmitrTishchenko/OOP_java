package praktik04;

public class LittleShield implements Shield {
    @Override
    public Integer absorb() {
        return 100;
    }

    @Override
    public String toString() {
        return String.format(" Shield absorb %d", absorb());
    }
}
