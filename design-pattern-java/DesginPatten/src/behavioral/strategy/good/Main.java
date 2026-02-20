package behavioral.strategy.good;

public class Main {
    public static void main(String[] args) {



        ShoppingCart cart = new ShoppingCart();
        cart.addItem("laptop", 100000);
        cart.addItem("apple", 5000);
        cart.addItem("orange", 1000);
        cart.addItem("pear", 500);
        cart.addItem("kiwi", 500);
        System.out.println("the pay with the cart ");
        cart.setPaymentStrategy(new CreditCardStrategy("1234567890123456", "123", "12/25"));
        cart.checkout();


        System.out.println("\n=== تغيير لـ PayPal ===");
        cart.setPaymentStrategy(new PayPalStrategy("customer@email.com"));
        cart.checkout();


        System.out.println("\n=== تغيير للدفع النقدي ===");
        cart.setPaymentStrategy(new CashStrategy());
        cart.checkout();

    }
}
