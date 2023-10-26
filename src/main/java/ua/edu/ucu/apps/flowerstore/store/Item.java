package ua.edu.ucu.apps.flowerstore.store;

public abstract class Item {
    private String description;
    public abstract double getPrice();
    public String getDescription(){
        return description;
    }
}
