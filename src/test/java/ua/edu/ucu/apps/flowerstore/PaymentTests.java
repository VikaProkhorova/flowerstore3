package ua.edu.ucu.apps.flowerstore;
import static org.junit.Assert.*;
import org.junit.Test;

import ua.edu.ucu.apps.flowerstore.payments.CreditCardPaymentStrategy;
import ua.edu.ucu.apps.flowerstore.payments.PayPalPaymentStrategy;
import ua.edu.ucu.apps.flowerstore.payments.Payment;

public class PaymentTests {
    @Test
    public void testCreditCardPaymentSuccess() {
        Payment creditCardPayment = new CreditCardPaymentStrategy("1234-5678-9012-3456", "John Doe", "12/25", "123");
        boolean result = creditCardPayment.pay(100.0);
        assertTrue(result);
    }

    @Test
    public void testCreditCardPaymentFailure() {
        Payment creditCardPayment = new CreditCardPaymentStrategy("invalid-card-number", "John Doe", "12/25", "123");
        boolean result = creditCardPayment.pay(100.0);
        assertFalse(result);
    }

    @Test
    public void testPayPalPaymentSuccess() {
        Payment paypalPayment = new PayPalPaymentStrategy("johndoe@example.com");
        boolean result = paypalPayment.pay(50.0);
        assertTrue(result);
    }

    @Test
    public void testPayPalPaymentFailure() {
        Payment paypalPayment = new PayPalPaymentStrategy("invalid-email");
        boolean result = paypalPayment.pay(50.0);
        assertFalse(result);
    }
}

