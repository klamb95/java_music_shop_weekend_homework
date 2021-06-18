package instruments;

public class Piano extends Instrument implements IPlay{

    
    public Piano(String colour, String material, InstrumentType type, int priceBought, int priceSold) {
        super(colour, material, type, priceBought, priceSold);
    }

    @Override
    public String play() {
        return null;
    }
}
