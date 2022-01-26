import java.util.Objects;

public class Tv extends Appliances {
   private String diagonal;

    public Tv(String brandName, int id, int price, String household, String diagonal) {
        super(brandName, id, price, household);
        this.diagonal = diagonal;
    }

    public String getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(String diagonal) {
        this.diagonal = diagonal;
    }

    @Override
    public String toString() {
        return "Tv{" +
                "diagonal='" + diagonal + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Tv tv = (Tv) o;
        return Objects.equals(diagonal, tv.diagonal);
    }


}
