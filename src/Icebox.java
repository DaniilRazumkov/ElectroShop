import java.util.Objects;

public class Icebox extends Appliances {
   private Boolean noFrost;

    public Icebox(String brandName, int id, int price, String household, Boolean noFrost) {
        super(brandName, id, price, household);
        this.noFrost = noFrost;
    }

    public Boolean getNoFrost() {
        return noFrost;
    }

    public void setNoFrost(Boolean noFrost) {
        this.noFrost = noFrost;
    }

    @Override
    public String toString() {
        return "Icebox{" +
                "noFrost=" + noFrost +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Icebox icebox = (Icebox) o;
        return Objects.equals(noFrost, icebox.noFrost);
    }


}
