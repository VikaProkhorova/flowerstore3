package ua.edu.ucu.apps.flowerstore;

import ua.edu.ucu.apps.flowerstore.delivery.Delivery;
import ua.edu.ucu.apps.flowerstore.payments.Payment;
import ua.edu.ucu.apps.flowerstore.store.Item;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Setter
@Getter @AllArgsConstructor @ToString @NoArgsConstructor
public class Order {
    private List<Item> items;
    private Payment payment;
    private Delivery delivery;
    
    public void setPaymentStrategy(Payment newPayment){
        this.payment = newPayment;
    }
    public void setDeliveryStrategy(Delivery newDelivery){
        this.delivery = newDelivery;
    }
    public void addItem(Item item){
        items.add(item);
    }
    public void removeItem(Item item){
        items.remove(item);
    }
    public void processOrder(){
        if (payment.pay(calculateTotalPrice())){
            delivery.deliver(items);
        }
    }
    public float calculateTotalPrice(){
        float res = 0;
        for (Item item : items){
            res += item.getPrice();
        }
        return res;
    }
}
