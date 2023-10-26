package ua.edu.ucu.apps.flowerstore.payments;

public class PayPalPaymentStrategy implements Payment {
    private String email;

    public PayPalPaymentStrategy(String email) {
        this.email = email;
    }
    @Override
    public boolean pay(double price) {
        if (email.matches("^[A-Za-z0-9+_.-]+@(.+)$")){
            return true;
        }
        return false;
    }
}
