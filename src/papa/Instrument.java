package papa;

import main.ElectronicProduct;

import java.util.Objects;

public class Instrument extends ElectronicProduct {
    private String professional;
    private int powerful;

    public Instrument(String brandName, int id, int price, String professional, int powerful) {
        super(brandName, id, price);
        this.professional = professional;
        this.powerful = powerful;
    }

    public String getProfessional() {
        return professional;
    }

    public void setProfessional(String professional) {
        this.professional = professional;
    }

    public int getPowerful() {
        return powerful;
    }

    public void setPowerful(int powerful) {
        this.powerful = powerful;
    }

    @Override
    public String toString() {
        return "papa.Instrument{" +
                "professional='" + professional + '\'' +
                ", powerful=" + powerful +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Instrument that = (Instrument) o;
        return powerful == that.powerful && Objects.equals(professional, that.professional);
    }

}
