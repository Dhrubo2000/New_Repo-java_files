

class Bank {
    
    private long account_num;
    private double balance;

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("amount deposited.....");
        }else{
            System.out.println("invallid amount.....");
        }
    }

    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            // double bal = getBalance();
            System.out.println("amount withdrawn......");
            System.out.println(getBalance());
        }else{
            System.out.println("insufficient balance");
        }
    }

    public void setAccountNum(long account_num){
        this.account_num = account_num;
    }

    // public void setBalance(double balance){
    //     this.balance = balance;
    // }

    public long getAccountNum(){
        return this.account_num;
    }

    public double getBalance(){
        return this.balance;
    }
}
