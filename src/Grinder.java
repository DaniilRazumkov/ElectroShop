public class Grinder extends Instrument {
    private int rotation;

    public Grinder(String brandName, int id, int price, String professional, int powerful, int rotation) {
        super(brandName, id, price, professional, powerful);
        this.rotation = rotation;
    }

    public int getRotation() {
        return rotation;
    }

    public void setRotation(int rotation) {
        this.rotation = rotation;
    }

    @Override
    public String toString() {
        return "Grinder{" +
                "rotation=" + rotation +
                '}';
    }
}
