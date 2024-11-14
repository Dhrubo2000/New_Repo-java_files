package Exceptions;

public class Bank {
    
    private int amount;
    private int balance;

    public Bank(int amount, int balance){
        this.amount = amount;
        this.balance = balance;
    }

    public void withdraw() throws Exception{
        if(amount > balance){
            throw new Exception("Insufficient balance");
        }
        balance = balance - amount;
    }


    public static void main(String args[]){
        Bank b = new Bank(20, 10);
        try {
            b.withdraw();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
