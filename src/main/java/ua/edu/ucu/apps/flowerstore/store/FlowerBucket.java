package ua.edu.ucu.apps.flowerstore.store;

import java.util.List;
import java.util.ArrayList;

public class FlowerBucket extends Item {
    private List<FlowerPack> flowerPacks = new ArrayList<>();
    public double getPrice() {
        double price = 0;
        for (FlowerPack flowerPack: flowerPacks) {
            price += flowerPack.getPrice();
        }
        return price;
    }
    public void addFlowerPack(FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
    }
    @Override
    public String getDescription() {
        String description = "";
        for (FlowerPack flowerPack: flowerPacks) {
            description+=flowerPack.getDescription() + "; ";
        }
        if (description == ""){
           return "Bucket has nothing";
        }
        return "Bucket have "+description;
    }
}
