package instruments;

import instruments.instrumentTypes.InstrumentType;
import instruments.instrumentTypes.PianoType;

public class Piano extends Instrument {

    private int numberOfKeys;

    private PianoType pianoType;

    public Piano(InstrumentType instrumentType, String material, String supplier, String colour, int numberOfKeys, PianoType pianoType) {
        super(instrumentType, material, supplier, colour);
        this.numberOfKeys = numberOfKeys;
        this.pianoType = pianoType;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public PianoType getPianoType() {
        return pianoType;
    }

    public String play() {
        return "123";
    }
}