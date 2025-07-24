import java.util.Scanner;

public class Fibonacci {
    void fibonacciseries(int n)
    {
        int a=0;
        int b=1;
        int next;
        for(int i=1;i<=n;i++)
        {
            System.out.println(a+ " ");
            next=a+b;
            a=b;
            b=next;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Fibonacci f=new Fibonacci();
        f.fibonacciseries(n);
    }
}
