import java.util.Scanner;

public class Bank {
     double bankbalance;

   public Bank(double minimumbalnce){
    this.bankbalance=minimumbalnce;
   }
   public void getbankbalance(){
     System.out.println("The Balance Amount is:"+bankbalance);
   }
    public void withdrawl(double amt){
        if(amt<=bankbalance){
            System.out.println("The transaction has taken place");
            System.out.println("Balance amount is:"+(bankbalance-amt));
        }
        else{
            System.out.println("Sorry!Amount Insufficent");
        }
    }
    public void deposit(double amount){
        System.out.println("The amount is deposited successfully:");
        System.out.println("Balance amount is:"+(bankbalance+amount));
        bankbalance+=amount;
    }
    public void ministatment(){
        System.out.println("The balance amount is:"+bankbalance);
        System.out.println("The transcation was successful.Incase of griveances contact head office using helpline");
    }
    public void end(){
        System.out.println("Transacation has been processed.Take your card back");
    }
   }
   class ATM {
         Bank accBank_Server;
         Scanner sc = new Scanner(System.in);
        public ATM(Bank accBank_Server){
            this.accBank_Server=accBank_Server;
        }
        public void choicelist(){
               System.out.println("1.Check Bank Balance:");
               System.out.println("2.Deposition:");
               System.out.println("3.Withdrawl:");
               System.out.println("4.Mini Statement:");
               System.out.println("5.End Transaction:");
        }
        public void transaction(){
            while(true){
            System.out.println("Do enter the choice:");
            choicelist();
            int performtransaction=sc.nextInt();
             double amount; 
            switch (performtransaction) {
                case 1:
                 accBank_Server.getbankbalance();
                    break;
                case 2:
                 System.out.println("Enter the deposit amount:");
                  amount = sc.nextDouble();
                  accBank_Server.deposit(amount);
                    break;
                case 3:
                System.out.println("Enter the withdrawl amount:");
                amount = sc.nextDouble();
                accBank_Server.withdrawl(amount);
                     break;
                case 4:
                 accBank_Server.ministatment();
                    break;
                case 5:
                 accBank_Server.end();
                   break;
                default:
                System.out.println("Transaction is Invalid! Select a valid one");
                    break;
         }
                System.out.println("Transaction has processed succesfully!");
      }
   }
               sc.close();
}
public class Main{
   public static void main(String[] args) {
     Bank Iob= new Bank(1000);
     ATM atm = new ATM(Iob);
     atm.transaction();
   }
}
