public class DemoBank {
    public static void main(String[] args) {
        Bank bank = new Bank();
        // bank.deposit(-1);
        bank.deposit(100);
        bank.withdraw(80);
        System.out.println(bank.getBalance());
       
    }
}
