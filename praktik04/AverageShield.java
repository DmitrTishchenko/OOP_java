package praktik04;

public class AverageShield implements Shield {

    @Override
    public Integer absorb() {

        return 200;
    }

    @Override
    public String toString() {
        return String.format(" Shield absorb %d", absorb());
    }
}
