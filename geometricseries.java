import java.util.Scanner;

public class geometricseries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
           if(i==1 || i==2)
           {
            System.out.print(0+ " ");
           }
           if(i%2==0)
           {
              System.out.print((i/2)*7+" " );
           }
           if(i%2==0)
           {
            System.out.print((i/2)*6 +" ");
           }
        }
        int result;
        if (n == 1 || n == 2) {
            result = 0;  
        } else if (n % 2 == 0) {
            result = (n / 2) * 6;  
        } else {
            result = (n / 2) * 7; 
        }
        
        System.out.println("The value at position " + n + " is: " + result);
    }
}