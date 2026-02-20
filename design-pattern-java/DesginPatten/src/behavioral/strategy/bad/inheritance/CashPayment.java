package behavioral.strategy.bad.inheritance;

/**
 * [BAD] الدفع النقدي باستخدام الوراثة
 */
public class CashPayment extends Payment {
    private String phoneNumber;

    public CashPayment(double amount, String phoneNumber) {
        super(amount);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void pay() {
        System.out.println("[CASH] الدفع نقدا عند الاستلام");
        System.out.println("   رقم الهاتف: " + phoneNumber);
        System.out.println("   المبلغ المطلوب: " + amount + " جنيه");
        System.out.println("   [SMS] تم إرسال SMS بتفاصيل الطلب");
    }

    @Override
    public void refund() {
        System.out.println("[ERROR] لا يمكن إرجاع المبلغ النقدي تلقائيا!");
        System.out.println("   يرجى التواصل مع خدمة العملاء");
    }
}
