package behavioral.strategy.bad;

/**
 * [BAD] الممارسة السيئة الثانية: Switch Case
 *
 * المشاكل:
 * 1. كل طريقة دفع جديدة = تعديل هذا الملف
 * 2. الكلاس يكبر مع كل إضافة
 * 3. انتهاك Open/Closed Principle
 * 4. صعوبة الاختبار (Unit Testing)
 */
public class PaymentServiceSwitch {

    public enum PaymentType {
        CREDIT_CARD,
        PAYPAL,
        CASH,
        WALLET,
        APPLE_PAY,
        GOOGLE_PAY
    }

    public void pay(PaymentType type, double amount) {

        switch (type) {
            case CREDIT_CARD:
                System.out.println("[CREDIT CARD] الدفع بالبطاقة الائتمانية");
                System.out.println("   الاتصال ببوابة الدفع...");
                System.out.println("   التحقق من الرصيد...");
                System.out.println("   خصم " + amount + " جنيه");
                System.out.println("   إرسال إيصال بالإيميل...");
                break;

            case PAYPAL:
                System.out.println("[PAYPAL] الدفع عبر PayPal");
                System.out.println("   الاتصال بـ PayPal API...");
                System.out.println("   تسجيل الدخول...");
                System.out.println("   خصم " + amount + " جنيه");
                break;

            case CASH:
                System.out.println("[CASH] الدفع نقدا");
                System.out.println("   تأكيد الطلب للدفع عند الاستلام");
                System.out.println("   المبلغ المطلوب: " + amount + " جنيه");
                System.out.println("   إرسال SMS...");
                break;

            case WALLET:
                System.out.println("[WALLET] الدفع من المحفظة");
                System.out.println("   التحقق من رصيد المحفظة...");
                System.out.println("   خصم " + amount + " جنيه");
                break;

            case APPLE_PAY:
                System.out.println("[APPLE PAY] الدفع عبر Apple Pay");
                System.out.println("   التحقق من Face ID...");
                System.out.println("   خصم " + amount + " جنيه");
                break;

            case GOOGLE_PAY:
                System.out.println("[GOOGLE PAY] الدفع عبر Google Pay");
                System.out.println("   التحقق من البصمة...");
                System.out.println("   خصم " + amount + " جنيه");
                break;

            default:
                System.out.println("[ERROR] طريقة دفع غير معروفة!");
        }
    }

    // [BAD] تخيل لو أضفنا المزيد من الطرق...
    // [BAD] الملف سيصبح 500+ سطر!
    // [BAD] كل تعديل يحتاج تغيير هذا الكلاس
}
