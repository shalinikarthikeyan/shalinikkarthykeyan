import java.util.Scanner;

public class averagecal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            sum=sum+a[i];
        }
        try{
            System.out.println(sum/n);
        }
        catch(Exception e)
        {
            System.out.println("Cannot divide by zero.");
        }

    }
}
