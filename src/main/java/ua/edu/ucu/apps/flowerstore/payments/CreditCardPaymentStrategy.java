package ua.edu.ucu.apps.flowerstore.payments;

public class CreditCardPaymentStrategy implements Payment{
    private String creditCardNumber;
    private String name;
    private String expirationDate;
    private String cvv;

    public CreditCardPaymentStrategy(String creditCardNumber, String name, String expirationDate, String cvv) {
        this.creditCardNumber = creditCardNumber;
        this.name = name;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
    }
    @Override
    public boolean pay(double price) {
        boolean isCorrectName = name.matches("^[A-Za-z\\s'-]+$");
        boolean isCorrectCardNumber = creditCardNumber.matches("^\\d{4}-\\d{4}-\\d{4}-\\d{4}$");
        boolean isCorrectExpirationDate = expirationDate.matches("^(0[1-9]|1[0-2])/(\\d{2}|\\d{4})$");
        boolean isCorrectCvv = cvv.matches("^[0-9]{3,4}$");
        if (isCorrectCardNumber && isCorrectCvv && isCorrectExpirationDate && isCorrectName){
            return true;
        }
        return false;
    }
}
