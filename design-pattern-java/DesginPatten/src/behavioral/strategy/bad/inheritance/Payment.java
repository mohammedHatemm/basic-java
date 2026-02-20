package behavioral.strategy.bad.inheritance;

/**
 * [BAD] الممارسة السيئة الثالثة: استخدام الوراثة بشكل خاطئ
 *
 * المشكلة الرئيسية:
 * - الوراثة تحدد السلوك وقت الكتابة (Compile Time)
 * - لا يمكن تغيير طريقة الدفع أثناء التشغيل (Runtime)
 * - "Favor Composition over Inheritance" قاعدة مهمة!
 */
public abstract class Payment {
    protected double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    public abstract void pay();

    public abstract void refund();

    public double getAmount() {
        return amount;
    }
}
