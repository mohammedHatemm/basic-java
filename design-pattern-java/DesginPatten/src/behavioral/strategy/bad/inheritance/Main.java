package behavioral.strategy.bad.inheritance;

/**
 * [BAD] توضيح الممارسة السيئة - المستوى الثالث
 *
 * المشكلة: استخدام الوراثة بدلا من التركيب (Composition)
 * - لا يمكن تغيير طريقة الدفع أثناء التشغيل (Runtime)
 * - الـ amount مرتبط بـ Payment وليس بالـ Cart
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("================================================================");
        System.out.println("   [BAD] المستوى الثالث: الوراثة السيئة (Bad Inheritance)       ");
        System.out.println("================================================================");

        // ==============================================================
        // السيناريو: عميل يريد شراء منتجات
        // ==============================================================

        System.out.println("\n=== السيناريو 1: إنشاء سلة بالدفع بالبطاقة ===\n");

        // [BAD] المشكلة: يجب تحديد المبلغ مسبقا في Payment!
        Payment creditPayment = new CreditCardPayment(
                1000,  // [BAD] هذا المبلغ قد يكون خاطئ!
                "1234567890123456",
                "123",
                "12/25"
        );

        ShoppingCart cart1 = new ShoppingCart(creditPayment);
        cart1.addItem("لابتوب HP", 5000);
        cart1.addItem("ماوس لوجيتك", 200);
        cart1.addItem("كيبورد ميكانيكي", 800);

        cart1.checkout();

        // ==============================================================
        // [BAD] المشكلة الكبرى: العميل يريد تغيير طريقة الدفع!
        // ==============================================================

        System.out.println("\n\n=== السيناريو 2: العميل يريد تغيير لـ PayPal ===\n");
        System.out.println("[BAD] المشكلة: لا يمكن تغيير طريقة الدفع بسهولة!");
        System.out.println("[BAD] يجب إنشاء Payment جديد بالمبلغ الصحيح!");

        // [BAD] الطريقة المعقدة لتغيير طريقة الدفع
        double correctAmount = cart1.calculateTotal();
        Payment paypalPayment = new PayPalPayment(
                correctAmount,  // يجب حساب المبلغ يدويا!
                "customer@email.com",
                "password123"
        );

        cart1.setPayment(paypalPayment);
        System.out.println("\n[WARNING] تم تغيير طريقة الدفع (بطريقة معقدة):");
        cart1.checkout();

        // ==============================================================
        // [BAD] مشكلة أخرى: إنشاء سلة جديدة
        // ==============================================================

        System.out.println("\n\n=== السيناريو 3: الطريقة الوحيدة الصحيحة ===\n");
        System.out.println("[BAD] يجب إنشاء سلة جديدة بالكامل!");

        // [BAD] يجب معرفة المبلغ قبل إنشاء السلة!
        // [BAD] لكن كيف نعرف المبلغ قبل إضافة المنتجات؟!
        Payment cashPayment = new CashPayment(6000, "01012345678");
        ShoppingCart cart2 = new ShoppingCart(cashPayment);
        cart2.addItem("لابتوب HP", 5000);
        cart2.addItem("ماوس لوجيتك", 200);
        cart2.addItem("كيبورد ميكانيكي", 800);

        cart2.checkout();

        // ==============================================================
        // [BAD] ملخص المشاكل
        // ==============================================================

        System.out.println("\n\n================================================================");
        System.out.println("              [BAD] مشاكل استخدام الوراثة                       ");
        System.out.println("================================================================");
        System.out.println("  1. الـ amount مرتبط بـ Payment (تصميم سيء)                   ");
        System.out.println("  2. لا يمكن تغيير طريقة الدفع بسهولة (Runtime)                ");
        System.out.println("  3. يجب معرفة المبلغ قبل إنشاء السلة!                         ");
        System.out.println("  4. Tight Coupling بين الكلاسات                               ");
        System.out.println("  5. انتهاك: Favor Composition over Inheritance                ");
        System.out.println("================================================================");

        System.out.println("\n[SOLUTION] الحل: استخدم Strategy Pattern مع Composition!");
        System.out.println("   - الـ Strategy لا تحمل الـ amount");
        System.out.println("   - الـ amount يمرر كـ parameter للـ pay() method");
        System.out.println("   - يمكن تغيير الـ Strategy في أي وقت (Runtime)");
        System.out.println("\n   راجع مجلد 'good' للتطبيق الصحيح");
    }
}
