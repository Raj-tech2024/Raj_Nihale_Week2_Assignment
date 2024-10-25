 class Banking
 {
     double total_amount = 30000;
     public void withdrawal_amount(double Withrawal_amount)
     {
         total_amount= total_amount-Withrawal_amount;
         System.out.println("Total amount after withdrawal:"+total_amount);
     }
     public void deposit(double Deposit_amount)
     {
         total_amount=total_amount+Deposit_amount;
         System.out.println("The total amount after deposit: "+total_amount);
     }
 }

public class Week2_second_qus {
    public static void main(String[] args) {
         Banking bank = new Banking();
        bank.withdrawal_amount(5000);
        bank.deposit(10000);
    }
}
