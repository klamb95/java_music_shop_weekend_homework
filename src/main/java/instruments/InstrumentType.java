package instruments;

public enum InstrumentType {

    BRASS("Brass"),
    WOODWIND("Woodwind"),
    STRING("String"),
    KEYBOARD("Keyboard");

    private final String instrumentType;

    InstrumentType(String instrumentType){
        this.instrumentType = instrumentType;
    }
}
