package behavioral.strategy.bad.inheritance;

/**
 * [BAD] الدفع بالبطاقة باستخدام الوراثة
 *
 * المشكلة: هذا الكلاس مرتبط بـ amount بشكل دائم
 * لا يمكن إعادة استخدامه بسهولة
 */
public class CreditCardPayment extends Payment {
    private String cardNumber;
    private String cvv;
    private String expiryDate;

    public CreditCardPayment(double amount, String cardNumber, String cvv, String expiryDate) {
        super(amount);
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }

    @Override
    public void pay() {
        System.out.println("[CREDIT CARD] الدفع بالبطاقة الائتمانية");
        System.out.println("   رقم البطاقة: ****" + cardNumber.substring(cardNumber.length() - 4));
        System.out.println("   تاريخ الانتهاء: " + expiryDate);
        System.out.println("   المبلغ: " + amount + " جنيه");
        System.out.println("   [OK] تمت العملية بنجاح!");
    }

    @Override
    public void refund() {
        System.out.println("[REFUND] إرجاع " + amount + " جنيه للبطاقة ****" + cardNumber.substring(cardNumber.length() - 4));
    }
}
