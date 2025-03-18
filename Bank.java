 import java.util.*;
 class BankAccount {
    
    int accountnumber;
    int balance=0;
    void deposit(int n)
    {
        balance=n+balance;
        System.out.println(balance);
    }
}
class SavingAccount extends BankAccount{
    
    void addinterest(int r){
        r=(r*balance)/100;
        System.out.println(r+balance);
    }
}
public class Bank
{
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // int r=sc.nextInt();
        SavingAccount sa=new SavingAccount();
        sa.deposit(700);
        sa.addinterest(3);
    }
}