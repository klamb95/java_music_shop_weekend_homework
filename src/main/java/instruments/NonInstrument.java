package instruments;

public class NonInstrument implements ISellNonInstruments {

    private String name;
    private int numberOfItems;
    private int priceBought;
    private int priceSold;

    public NonInstrument(String name, int numberOfItems, int priceBought, int priceSold) {
        this.name = name;
        this.numberOfItems = numberOfItems;
        this.priceBought = priceBought;
        this.priceSold = priceSold;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public int getPriceBought() {
        return priceBought;
    }

    public int getPriceSold() {
        return priceSold;
    }

    public int markUp(NonInstrument nonInstrument){
        return this.priceBought - this.priceSold;
    }
}
