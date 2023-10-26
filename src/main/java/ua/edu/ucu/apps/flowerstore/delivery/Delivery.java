package ua.edu.ucu.apps.flowerstore.delivery;
import ua.edu.ucu.apps.flowerstore.store.Item;

import java.util.List;

public interface Delivery {
    void deliver(List<Item>items);
}
