package children;

import papa.Instrument;

import java.util.Objects;

public class CircularSaw extends Instrument {
    private Boolean batery;

    public CircularSaw(String brandName, int id, int price, String professional, int powerful, Boolean batery) {
        super(brandName, id, price, professional, powerful);
        this.batery = batery;
    }

    public Boolean getBatery() {
        return batery;
    }

    public void setBatery(Boolean batery) {
        this.batery = batery;
    }

    @Override
    public String toString() {
        return "children.CircularSaw{" +
                "batery=" + batery +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CircularSaw that = (CircularSaw) o;
        return Objects.equals(batery, that.batery);
    }


}
