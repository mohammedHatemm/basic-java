package behavioral.strategy.bad;

public class PaymentService {
    public void pay(String paymentType , double amount ) {
        if(paymentType.equals("CreditCard")) {
            System.out.println("connected with payment gatway ");
            System.out.println("make sure that the user has enough money in his bank acount  ");
            System.out.println("the discount is " + amount * 0.01 + "form the cart");
            System.out.println("sending an email for you ....");
        }else if(paymentType.equals("paypal")) {
            System.out.println("connected with payment gatway with api  ");
            System.out.println("log in to you account ");
            System.out.println("your payment is " + amount * 0.01 + "form the cart");
            System.out.println("sending an email for you ....");
        }else if(paymentType.equals("cash")) {
            System.out.println("the request to pay in delever is sent   ");
            System.out.println("your payment is " + amount * 0.01 );
            System.out.println("sms has been sent ");
        }else if(paymentType.equals("wallet")) {
            System.out.println("make sure the user have money in hes account   ");
        }
    }
}
