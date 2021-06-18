package shop;

import instruments.Instrument;
import nonInstruments.NonInstrument;

import java.util.ArrayList;

public class Shop {
    private String name;
    private ArrayList<Instrument> Instruments;
    private ArrayList<NonInstrument> NonInstruments;

    public Shop(String name){
        this.name = name;
        this.Instruments = new ArrayList<Instrument>();
        this.NonInstruments = new ArrayList<NonInstrument>();
    }

    public String getName() {
        return name;
    }

    public int getInstruments(){
        return this.Instruments.size();
    }

    public int getNonInstruments(){
        return this.NonInstruments.size();
    }

    public void addInstrument(Instrument instrument){
        this.Instruments.add(instrument);
    }

    public void addNonInstrument(NonInstrument nonInstrument){
        this.NonInstruments.add(nonInstrument);
    }

    public void removeInstrument(Instrument instrument){
        this.Instruments.remove(instrument);
    }

    public void removeNonInstrument(NonInstrument nonInstrument){
        this.NonInstruments.remove(nonInstrument);
    }
}
