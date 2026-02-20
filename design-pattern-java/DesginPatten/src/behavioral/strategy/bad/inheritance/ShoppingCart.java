package behavioral.strategy.bad.inheritance;

import java.util.ArrayList;
import java.util.List;

/**
 * [BAD] هنا المشكلة الكبرى في استخدام الوراثة!
 *
 * المشاكل:
 * 1. طريقة الدفع محددة في الـ Constructor ولا يمكن تغييرها
 * 2. لتغيير طريقة الدفع يجب إنشاء Cart جديد
 * 3. الـ amount موجود داخل Payment وليس في Cart
 * 4. تصميم غير مرن وصعب الصيانة
 */
public class ShoppingCart {
    private List<Item> items = new ArrayList<>();
    private Payment payment;  // [BAD] ثابت ولا يمكن تغييره بسهولة!

    // Inner class للمنتجات
    public static class Item {
        String name;
        double price;

        public Item(String name, double price) {
            this.name = name;
            this.price = price;
        }
    }

    // [BAD] مشكلة 1: نوع الدفع محدد في Constructor
    public ShoppingCart(Payment payment) {
        this.payment = payment;
    }

    public void addItem(String name, double price) {
        items.add(new Item(name, price));
        System.out.println("[ADDED] تم إضافة: " + name + " - " + price + " جنيه");
    }

    public double calculateTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.price;
        }
        return total;
    }

    public void showCart() {
        System.out.println("\n[CART] محتويات السلة:");
        System.out.println("------------------------------");
        for (Item item : items) {
            System.out.println("   - " + item.name + ": " + item.price + " جنيه");
        }
        System.out.println("------------------------------");
        System.out.println("   المجموع: " + calculateTotal() + " جنيه");
    }

    public void checkout() {
        showCart();
        System.out.println("\n[CHECKOUT] إتمام عملية الدفع...");

        // [BAD] مشكلة: الـ amount في Payment قد يكون مختلف عن total!
        // تصميم سيء لأن Payment يحمل amount خاص به
        payment.pay();
    }

    // [BAD] مشكلة 2: لا يوجد setPayment!
    // لأن تغيير Payment يعني تغيير الـ amount أيضا
    // وهذا تصميم معقد وسيء

    // [BAD] مشكلة 3: لو أردنا إضافة setPayment ستكون معقدة:
    public void setPayment(Payment newPayment) {
        // [BAD] المشكلة: Payment القديم له amount مختلف!
        // [BAD] يجب إنشاء Payment جديد بالـ amount الصحيح
        // [BAD] تصميم سيء جدا!
        this.payment = newPayment;
        System.out.println("[WARNING] تحذير: الـ amount في Payment قد يكون غير صحيح!");
    }
}
