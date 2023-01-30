package shopItems;

import Interfaces.ISell;
import instruments.Guitar;
import instruments.instrumentTypes.GuitarType;
import instruments.instrumentTypes.InstrumentType;

public class RockstarGuitar extends Guitar implements ISell {
    private double buyPrice;

    private double sellPrice;

    private String description;

    public RockstarGuitar(InstrumentType instrumentType, String material, String supplier, String colour, int numberOfStrings, GuitarType guitarType, double buyPrice, double sellPrice, String description) {
        super(instrumentType, material, supplier, colour, numberOfStrings, guitarType);
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.description = description;
    }
    public String play() {
        return "Play some notes";
    }
    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }
    public String getDescription() {
        return description;
    }

    public double calculateMarkup() {
        return sellPrice - buyPrice;
    }

}
