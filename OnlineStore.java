import java.util.Scanner;

class customer{
    int customerid;
    String name;
    double calculatediscount(double amt){
        return amt*0.05;
    }
}
@Overriding
class premiumcustomer extends customer{
    
    double calculatediscount(double mt){
        return mt*0.10;
    }
}
public class OnlineStore {
    public static void main(String[] args) {
       // Scanner sc=new Scanner(System.in);
        //int amount=sc.nextInt();
        premiumcustomer c=new premiumcustomer();
        customer d=new customer();
        System.out.println(c.calculatediscount(10000.0));
        System.out.println(d.calculatediscount(10000));
    }
    
}