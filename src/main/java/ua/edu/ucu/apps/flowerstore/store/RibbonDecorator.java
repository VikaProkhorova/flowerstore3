package ua.edu.ucu.apps.flowerstore.store;

public class RibbonDecorator extends ItemDecorator{
    private final Item item;

    public RibbonDecorator(Item item){
        this.item = item;
    }
    @Override
    public double getPrice() {
        return 40 + item.getPrice();
    }

    @Override
    public String getDescription() {
        return item.getDescription();
    }
}
