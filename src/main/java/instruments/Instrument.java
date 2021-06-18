package instruments;

public abstract class Instrument {

    private String colour;
    private String material;
    private InstrumentType type;
    private int priceBought;
    private int priceSold;

    public Instrument(String colour, String material, InstrumentType type, int priceBought, int priceSold) {
        this.colour = colour;
        this.material = material;
        this.type = type;
        this.priceBought = priceBought;
        this.priceSold = priceSold;
    }

    public String getColour() {
        return colour;
    }

    public String getMaterial() {
        return material;
    }

    public InstrumentType getType() {
        return type;
    }
}
