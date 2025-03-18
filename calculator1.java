import java.util.Scanner;

public class calculator1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        // int[] a=new int[n];
        // for(int i;i<n;i++)
        // {
        //     a[i]=scanner.nextInt();
        // }
        try{
                System.out.println(n/m);
        }
        catch(Exception e)
        {
            System.out.println("Division by zero is not allowed.");
        }
    }
}
