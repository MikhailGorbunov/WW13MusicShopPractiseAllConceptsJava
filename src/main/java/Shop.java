import Interfaces.ISell;

import java.util.ArrayList;

public class Shop {
    private static Shop instance = null;

    private ArrayList<ISell> inventory;

    private Shop() {
        inventory = new ArrayList<>();
    }

    public static Shop getInstance() {
        if (instance == null) {
            instance = new Shop();
        }
        return instance;
    }

    public ArrayList<ISell> getInventory() {
        return inventory;
    }

    public void addToInventory(ISell newItem) {
        inventory.add(newItem);
    }

    public void removeFromInventory(ISell itemForRemoval) {
        inventory.remove(itemForRemoval);
    }

    public void clearInventory() {
        inventory.clear();
    }

    public double calculatePotentialProfit() {
        double potentialProfit = 0;
        for (int i = 0; i < inventory.size(); i++) {
            ISell item = inventory.get(i);
            potentialProfit += item.calculateMarkup();
        }
        return potentialProfit;
    }
}
