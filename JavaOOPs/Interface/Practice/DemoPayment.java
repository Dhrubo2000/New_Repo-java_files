package Interface.Practice;

public class DemoPayment {
    public static void main(String[] args) {
        
        Payment[] payment = {new CreditcardPayment(123456789), new MobileWalletPayment(987456321)};

        for (Payment payment2 : payment) {
            payment2.processPayment(999);
        }
    }
}

abstract class Payment {

    abstract void processPayment(double amount);

}

class CreditcardPayment extends Payment {
    
    private long cardNumber;

    public CreditcardPayment(long cardNumber){
        this.cardNumber = cardNumber;
    }

    public long getNumber(){
        return this.cardNumber;
    }

    @Override
    public void processPayment(double amount){
        System.out.println("the amount is :" + amount + "and the cardNumber is :" + getNumber());
    }

}

class MobileWalletPayment extends Payment {

    private long walletId;

    public MobileWalletPayment(long walletId){
        this.walletId = walletId;
    }

    public long getwalletID(){
        return this.walletId;
    }

    @Override
    public void processPayment(double amount){
        System.out.println("the amount is :" + amount + "and the walletID is :" + getwalletID());
    }


}
