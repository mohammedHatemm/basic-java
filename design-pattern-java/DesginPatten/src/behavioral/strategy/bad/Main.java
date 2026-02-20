package behavioral.strategy.bad;

/**
 * [BAD] توضيح الممارسات السيئة - المستوى الأول والثاني
 *
 * المستوى الأول: if-else (PaymentService)
 * المستوى الثاني: switch-case (PaymentServiceSwitch)
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("================================================================");
        System.out.println("     [BAD] الممارسات السيئة في Strategy Pattern                ");
        System.out.println("================================================================");

        // ==============================================================
        // المستوى الأول: if-else
        // ==============================================================
        System.out.println("\n=== المستوى الأول: if-else ===\n");

        PaymentService service1 = new PaymentService();

        System.out.println("--- الدفع بالبطاقة ---");
        service1.pay("CreditCard", 500);

        System.out.println("\n--- الدفع بـ PayPal ---");
        service1.pay("paypal", 300);

        System.out.println("\n--- الدفع نقدا ---");
        service1.pay("cash", 200);

        System.out.println("\n--- الدفع بالمحفظة ---");
        service1.pay("wallet", 100);

        // [BAD] المشكلة: ماذا لو أدخلنا نوع خاطئ؟
        System.out.println("\n--- [BAD] نوع دفع غير موجود ---");
        service1.pay("bitcoin", 1000);  // لن يحدث شيء!

        // ==============================================================
        // المستوى الثاني: switch-case
        // ==============================================================
        System.out.println("\n\n=== المستوى الثاني: switch-case ===\n");

        PaymentServiceSwitch service2 = new PaymentServiceSwitch();

        System.out.println("--- الدفع بالبطاقة ---");
        service2.pay(PaymentServiceSwitch.PaymentType.CREDIT_CARD, 500);

        System.out.println("\n--- الدفع بـ Apple Pay ---");
        service2.pay(PaymentServiceSwitch.PaymentType.APPLE_PAY, 300);

        System.out.println("\n--- الدفع بـ Google Pay ---");
        service2.pay(PaymentServiceSwitch.PaymentType.GOOGLE_PAY, 200);

        // ==============================================================
        // [BAD] لماذا هذا سيء؟
        // ==============================================================
        System.out.println("\n\n================================================================");
        System.out.println("                    [BAD] لماذا هذا سيء؟                        ");
        System.out.println("================================================================");
        System.out.println("  1. كل طريقة دفع جديدة = تعديل الكلاس                         ");
        System.out.println("  2. انتهاك Open/Closed Principle                              ");
        System.out.println("  3. الملف يصبح طويل جدا (500+ سطر)                            ");
        System.out.println("  4. صعوبة اختبار كل طريقة بشكل منفصل                          ");
        System.out.println("  5. تكرار الكود في أماكن كثيرة                                ");
        System.out.println("================================================================");

        System.out.println("\n[SOLUTION] الحل: استخدم Strategy Pattern!");
        System.out.println("   راجع مجلد 'good' للتطبيق الصحيح");
    }
}
