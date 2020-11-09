import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        
        Scanner in = new Scanner(System.in);
        Bank bank;
        String cn, at;
        int ano, choice;
        double amt;
        System.out.print("Enter customer name : ");
        cn = in.next();
        System.out.print("Enter account number : ");
        ano = in.nextInt();
		CurrentAccount account = new CurrentAccount();
		SavingsAccount account1 = new SavingsAccount();
        System.out.print("Enter 0 for current or 1 for savings : ");
        boolean flag = in.nextInt()==0?true:false;
        if(flag){
            at = "current";
        }
        else{
            at = "saving";
        }
        bank = new Bank(cn, ano, at);
        
        while(true) {
            System.out.println("Enter 1 to deposit");
            System.out.println("Enter 2 to withdraw");
            System.out.println("Enter 3 to check balance");
            if(!flag)
            System.out.println("Enter 4 to calculate interest");
            System.out.println("Enter -1 to quit");
            System.out.print("Enter your choice : ");
            choice = in.nextInt();
            if(choice==-1){
                break;
            }
            else if(choice==1) {
                System.out.println("Enter amount to be deposited : ");
                amt = Math.abs(in.nextDouble());
                if(flag)
					account.credit(amt);
				else
					account1.credit(amt);
            }
            else if(choice==2){
                System.out.println("Enter amount to be debited : ");
                amt = Math.abs(in.nextDouble());
                int status = 0;
                if(flag)
					status = account.debit(amt);
				else
                    status = account1.debit(amt);
                if(status==-1)
                    System.out.println("Could not debit");

            }
            else if(choice==3)
            {
                System.out.println(bank.toString());
				if(flag)
                System.out.println("Balance : "+account.getBalance());
				else
					System.out.println("Balance : "+account1.getBalance());
            }
            else if(choice==4&&!flag) {
				System.out.print("Enter number of years : ");
				amt = Math.abs(in.nextDouble());
                System.out.println("Balance before interest : "+account1.getBalance());
                account1.calculateInterest(amt);
                System.out.println("Balance after interest : "+account1.getBalance());
            }
		    else if(choice>5||choice==0||choice<-1||(choice==4&&flag))
            System.out.println("Invalid Input");
            }
        System.out.println("-----DONE-----");
        in.close();
    }
}