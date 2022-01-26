package children;

import papa.Appliances;

public class Cleaner extends Appliances {
    private int powerful;

    public Cleaner(String brandName, int id, int price, String household, int powerful) {
        super(brandName, id, price, household);
        this.powerful = powerful;
    }

    public int getPowerful() {
        return powerful;
    }

    public void setPowerful(int powerful) {
        this.powerful = powerful;
    }

    @Override
    public String toString() {
        return "children.Cleaner{" +
                "powerful=" + powerful +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cleaner cleaner = (Cleaner) o;
        return powerful == cleaner.powerful;
    }


}
