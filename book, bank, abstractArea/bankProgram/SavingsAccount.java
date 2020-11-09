class SavingsAccount extends Bank {
    private double balance;
    private double rate;
    SavingsAccount() {
        rate = 4.567;
        balance = 0.0D;
    }
    public double getBalance(){
        return balance;
    }

    public void credit(double amount) {
        balance = balance + amount;
    }

    public int debit(double amount) {
        if(balance-amount>=0){
            balance = balance - amount;
            return 0;
        }
        return -1;
    }

    public void calculateInterest(double time) {
        rate = rate/100;
        if(time>5)
            rate = 4.9/100;
        if(time>8)
        rate = 5.00/100;
        balance = balance*Math.pow((1+rate), time);
    }
}