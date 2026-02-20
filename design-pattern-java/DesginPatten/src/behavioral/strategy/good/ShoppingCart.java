package behavioral.strategy.good;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items = new ArrayList<>();
    private PaymentStrategy paymentStrategy;

    public static class Item {
         String name;
         double price;
         public Item(String name, double price) {
            this.name = name;
            this.price = price;
         }
    }

    public void addItem(String name, double price) {
        items.add(new Item(name, price));
        System.out.println("Item added to cart " + name + " with price " + price);

    }

    public double calculateTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.price;
        }
        return total;
    }
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;

    }

    public void checkout() {
        if(paymentStrategy == null) {
            System.out.println("please chose your payment method  ");
            return;
        }
        double total = calculateTotal();
        System.out.println("the payment is done ");
        System.out.println("the number of the items is " + items.size());
        System.out.println("the total price is " + total);
        System.out.println("the payment method is " + paymentStrategy.getMethodName());

    }

    }