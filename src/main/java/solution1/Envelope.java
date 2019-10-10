package solution1;

import java.util.Objects;

public class Envelope {

    private int height;
    private int wight;

    public Envelope(int height, int wight) {
        this.height = height;
        this.wight = wight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Envelope that = (Envelope) o;
        return height == that.height &&
                wight == that.wight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, wight);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWight() {
        return wight;
    }

    public void setWight(int wight) {
        this.wight = wight;
    }


    public boolean isBiggerThan(Envelope e) {
        return getHeight() > e.getHeight() && getWight() > e.getWight();
    }

    public boolean isEqual(Envelope e) {
        return getHeight() == e.getHeight() && getWight() == e.getWight();
    }

}
