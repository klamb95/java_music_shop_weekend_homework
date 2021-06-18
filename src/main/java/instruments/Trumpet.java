package instruments;

public class Trumpet extends Instrument implements IPlay{

    private int numberOfValves;



    public Trumpet(String colour, String material, InstrumentType type, int priceBought, int priceSold, int numberOfValves) {
        super(colour, material, type, priceBought, priceSold);
        this.numberOfValves = numberOfValves;
    }

    @Override
    public String play() {
        return "I am tooting";
    }

    @Override
    public int markUp(Instrument instrument) {
        return this.priceSold - this.priceBought;
    }
}
