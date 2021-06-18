package instruments;

public class Guitar extends Instrument implements IPlay{

    private int numberOfStrings;
    private boolean electric;

    public Guitar(String colour, String material, InstrumentType type, int priceBought, int priceSold, int numberOfStrings, boolean electric) {
        super(colour, material, type, priceBought, priceSold);
        this.numberOfStrings = numberOfStrings;
        this.electric = electric;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public boolean isElectric() {
        return electric;
    }

    @Override
    public String play() {
        return "Im strumming";
    }
}
