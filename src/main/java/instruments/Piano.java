package instruments;

public class Piano extends Instrument implements IPlay{

    private boolean electric;


    public Piano(String colour, String material, InstrumentType type, int priceBought, int priceSold, boolean electric) {
        super(colour, material, type, priceBought, priceSold);
        this.electric = electric;
    }

    public boolean isElectric() {
        return electric;
    }

    @Override
    public String play() {
        return "I am mashing the keys";
    }

    @Override
    public int markUp(Instrument instrument) {
        return this.priceSold - this.priceBought;
    }
}
