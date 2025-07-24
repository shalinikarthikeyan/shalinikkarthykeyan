import java.util.Scanner;

public class zohopattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2==0)
        {
            for(int i=2;i<=n;i+=2)
            {
                for(int space=0;space<(n-i);space++)
                {
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++)
                {
                System.out.print("* ");
                }
                System.out.println();
            }
            for(int i=n;i>=0;i-=2)
            {
                for(int space=0;space<(n-i);space++)
                {
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
        else{
            for(int i=1;i<n;i+=2)
            {
                System.out.print("* ");
            }
        }
    }
}
