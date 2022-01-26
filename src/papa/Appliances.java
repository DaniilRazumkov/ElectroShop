package papa;

import main.ElectronicProduct;

import java.util.Objects;

public class Appliances extends ElectronicProduct {
    private String household;

    public Appliances(String brandName, int id, int price, String household) {
        super(brandName, id, price);
        this.household = household;
    }

    public String getHousehold() {
        return household;
    }

    public void setHousehold(String household) {
        this.household = household;
    }

    @Override
    public String toString() {
        return "papa.Appliances{" +
                "household='" + household + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Appliances that = (Appliances) o;
        return Objects.equals(household, that.household);
    }


}
