package instruments;

import Interfaces.IPlay;
import instruments.instrumentTypes.InstrumentType;

public abstract class Instrument implements IPlay {

    InstrumentType instrumentType;

    String material;

    String supplier;

    String colour;

    public Instrument(InstrumentType instrumentType, String material, String supplier, String colour){
        this.instrumentType = instrumentType;
        this.material = material;
        this.supplier = supplier;
        this.colour = colour;
    }

    public InstrumentType getInstrumentType() {
        return this.instrumentType;
    }

    public String getMaterial() {
        return this.material;
    }

    public String getSupplier() {
        return this.supplier;
    }

    public String getColour() {
        return this.colour;
    }
}
