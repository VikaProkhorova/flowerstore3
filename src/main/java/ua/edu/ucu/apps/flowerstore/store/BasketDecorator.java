package ua.edu.ucu.apps.flowerstore.store;

public class BasketDecorator extends ItemDecorator{
    private final Item item;

    public BasketDecorator(Item item){
        this.item = item;
    }
    @Override
    public double getPrice() {
        return 4 + item.getPrice();
    }

    @Override
    public String getDescription() {
        return item.getDescription();
    }
}
