package ua.edu.ucu.apps.flowerstore.filters;
import ua.edu.ucu.apps.flowerstore.store.Item;

public interface SearchFilter {
    boolean match(Item item);
}
