import java.util.Scanner;

public class maxmin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        sc.close();
        System.out.println(a);
        int ma= a[0];
        int mi=a[0];
        for(int i=0;i<n;i++)
        {
            if(a[i]>ma){
                ma=a[i];
            }
            if(a[i]<mi){
                mi=a[i];
            }
        }
        System.out.println("Maximum value"+ma);
        System.out.println("Minimum value"+mi);
    }
}
