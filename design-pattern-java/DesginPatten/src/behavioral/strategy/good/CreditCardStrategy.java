package behavioral.strategy.good;

public class CreditCardStrategy implements PaymentStrategy {
    private String cardNumber;
    private String cvv;
    private String expiryDate;


    public CreditCardStrategy(String cardNumber, String cvv, String expiryDate) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expiryDate = expiryDate;

    }

    @Override
    public void pay(double amount){
        System.out.println("the payment with the creditCard");
        System.out.println("The card number is: " + cardNumber.substring(cardNumber.length()-4));

        System.out.println("Credit Card Number: " + amount);
        System.out.println("the transction is ok ");

    }

    @Override
    public String getMethodName() {
        return "creditCard";
    }
}
