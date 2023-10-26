package ua.edu.ucu.apps.flowerstore;
import org.junit.Test;

import ua.edu.ucu.apps.flowerstore.delivery.DHLDeliveryStrategy;
import ua.edu.ucu.apps.flowerstore.delivery.Delivery;
import ua.edu.ucu.apps.flowerstore.delivery.PostDeliveryStrategy;
import ua.edu.ucu.apps.flowerstore.store.Flower;
import ua.edu.ucu.apps.flowerstore.store.Item;
import java.util.List;

public class DeliveryTests {

    @Test
    public void testPostDelivery() {
        Delivery postDelivery = new PostDeliveryStrategy();
        Item item = new Flower();
        List<Item> items = List.of(item);
        postDelivery.deliver(items);
    }

    @Test
    public void testDHLDelivery() {
        Delivery dhlDelivery = new DHLDeliveryStrategy();
        Item item = new Flower();
        List<Item> items = List.of(item);
        dhlDelivery.deliver(items);
    }
}

