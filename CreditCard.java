package Task01;
interface Payment{
    void processPayment();
}
public class CreditCard implements Payment{
    public void processPayment() {
        System.out.println("Payment is done by using Credit Card");
    }
}

class PayPal implements Payment {
    public void processPayment() {
        System.out.println("Payment is done by using PayPal");
    }
}

class BankTransfer implements Payment {
    public void processPayment() {
        System.out.println("Payment is done by using Bank Transfer");
    }
}

class Main{
    public static void main(String[] args) {
        Payment cc = new CreditCard();
        Payment pp = new PayPal();
        Payment bt = new BankTransfer();

        cc.processPayment();
        pp.processPayment();
        bt.processPayment();
    }
}