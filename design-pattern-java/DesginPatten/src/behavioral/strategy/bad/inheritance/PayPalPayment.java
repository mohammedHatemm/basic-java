package behavioral.strategy.bad.inheritance;

/**
 * [BAD] الدفع بـ PayPal باستخدام الوراثة
 */
public class PayPalPayment extends Payment {
    private String email;
    private String password;

    public PayPalPayment(double amount, String email, String password) {
        super(amount);
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay() {
        System.out.println("[PAYPAL] الدفع عبر PayPal");
        System.out.println("   الحساب: " + email);
        System.out.println("   المبلغ: " + amount + " جنيه");
        System.out.println("   [OK] تمت العملية بنجاح!");
    }

    @Override
    public void refund() {
        System.out.println("[REFUND] إرجاع " + amount + " جنيه لحساب PayPal: " + email);
    }
}
