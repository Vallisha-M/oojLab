public class Bank {
    private String customerName;
    private String accountType;
    private int accountNumber;
    Bank(){
        customerName = null;
        accountType = null;
        accountNumber = 0;
    }
    Bank(String customerName, int accountNumber, String accountType) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
    }
    @Override
    public String toString(){
      return String.format("Customer Name : "+customerName+"\nAccount Number : "+accountNumber+"\nAccount Type : "+accountType);
    }
}