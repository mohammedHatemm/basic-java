package behavioral.strategy.good;

public class PayPalStrategy implements PaymentStrategy {
    private String email;
    public PayPalStrategy(String email) {
        this.email = email;
    }
    @Override
    public void pay(double amount) {
        System.out.println("Pay pal");
        System.out.println("Email: " + email);
        System.out.println("Amount: " + amount);
        System.out.println("transaction is ok ");

    }
    @Override
    public String getMethodName() {
        return "payPal";
    }
}
