package praktik04;

public class BigShield implements Shield {
    @Override
    public Integer absorb() {
        return 300;
    }

    @Override
    public String toString() {
        return String.format(" Shield absorb %d", absorb());
    }
}
