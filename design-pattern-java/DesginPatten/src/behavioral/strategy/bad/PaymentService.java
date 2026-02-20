package behavioral.strategy.bad;

/**
 * [BAD] الممارسة السيئة الأولى: if-else كثيرة
 *
 * المشاكل:
 * 1. كل طريقة دفع جديدة = تعديل هذا الملف
 * 2. انتهاك Open/Closed Principle
 * 3. الكلاس يكبر مع كل إضافة
 * 4. صعوبة الاختبار (Unit Testing)
 * 5. تكرار الكود
 */
public class PaymentService {

    public void pay(String paymentType, double amount) {

        if (paymentType.equals("CreditCard")) {
            System.out.println("[CREDIT CARD] الدفع بالبطاقة الائتمانية");
            System.out.println("   الاتصال ببوابة الدفع...");
            System.out.println("   التحقق من رصيد الحساب...");
            System.out.println("   خصم " + amount + " جنيه من البطاقة");
            System.out.println("   إرسال إيصال بالإيميل...");

        } else if (paymentType.equals("paypal")) {
            System.out.println("[PAYPAL] الدفع عبر PayPal");
            System.out.println("   الاتصال بـ PayPal API...");
            System.out.println("   تسجيل الدخول للحساب...");
            System.out.println("   خصم " + amount + " جنيه");
            System.out.println("   إرسال تأكيد بالإيميل...");

        } else if (paymentType.equals("cash")) {
            System.out.println("[CASH] الدفع نقدا عند الاستلام");
            System.out.println("   تأكيد الطلب...");
            System.out.println("   المبلغ المطلوب: " + amount + " جنيه");
            System.out.println("   إرسال SMS بتفاصيل الطلب...");

        } else if (paymentType.equals("wallet")) {
            System.out.println("[WALLET] الدفع من المحفظة الإلكترونية");
            System.out.println("   التحقق من رصيد المحفظة...");
            System.out.println("   خصم " + amount + " جنيه");
            System.out.println("   [OK] تمت العملية!");

        } else {
            // [BAD] هذا ضروري لكن كثير من المبرمجين ينسونه!
            System.out.println("[ERROR] خطأ: طريقة الدفع '" + paymentType + "' غير مدعومة!");
        }

        // [BAD] تخيل إضافة: Apple Pay, Google Pay, Bitcoin, Instapay, Vodafone Cash...
        // [BAD] الملف سيصبح 500+ سطر!
        // [BAD] كل مبرمج يعدل نفس الملف = Merge Conflicts!
    }
}
