package Innerclasses;

public class ShoppingCart {
    private double totalamount;

    public ShoppingCart(double totalamount){
        this.totalamount = totalamount;
    }

    public void processPayment(Payment payment){
        payment.pay(totalamount);
    }
}
