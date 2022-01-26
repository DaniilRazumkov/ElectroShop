import java.util.Objects;

public class Drill extends Instrument {
    private String large;

    public Drill(String brandName, int id, int price, String professional, int powerful, String large) {
        super(brandName, id, price, professional, powerful);
        this.large = large;
    }

    public String getLarge() {
        return large;
    }

    public void setLarge(String large) {
        this.large = large;
    }

    @Override
    public String toString() {
        return "Drill{" +
                "large='" + large + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Drill drill = (Drill) o;
        return Objects.equals(large, drill.large);
    }

}
