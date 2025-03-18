import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean f=true;
        
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                f=false;
            }
            i++;
        }
        System.out.println(f?"prime":"Not prime");
    }
}
