import java.util.Scanner;

public class gridpattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int j;
        int i;
        for(i=1;i<=n;i++)
        {
            for( j=1;j<=n;j++)
            {
                if(i==1||j==1||i==j||i==n||j==n||j==n-i+1){
                  System.out.print("*");
              }
              else{
              System.out.print(" ");
              }
           }
           System.out.println();
        }                                                                                                                                                                       
        
    }
}
