class CurrentAccount extends Bank {
    private double balance;

    CurrentAccount() {
        balance = 0.0D;
    }
    public double getBalance(){
        return balance;
    }

    public void credit(double amount) {
        balance = balance + amount;
        this.minimumBalance();
    }

    public int debit(double amount) {
        if(balance>100&&balance-amount>=0){
        balance = balance - amount;
        this.minimumBalance();
        return 0;
        }
        return -1;
    }

    public void minimumBalance() {
        int fine = 0;
        if(balance<1000) {
            fine = 100;
        }
        balance = balance - fine;
    }
}