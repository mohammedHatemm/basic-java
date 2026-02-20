package behavioral.strategy.good;

public class CashStrategy implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("cash on delevery ");
        System.out.println("the amount is " + amount);
        System.out.println("the transaction is ok ");
    }

    @Override
    public String getMethodName() {
        return "Cash on delivery ";
    }

}
