import java.util.Objects;

public class ElectronicProduct {
    private String brandName;
    private int id;
    private int price;

    public ElectronicProduct(String brandName, int id, int price) {
        this.brandName = brandName;
        this.id = id;
        this.price = price;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ElectronicProduct{" +
                "brandName='" + brandName + '\'' +
                ", id=" + id +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ElectronicProduct that = (ElectronicProduct) o;
        return id == that.id && price == that.price && Objects.equals(brandName, that.brandName);
    }


}
