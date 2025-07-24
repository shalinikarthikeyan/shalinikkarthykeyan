import java.util.Scanner;

public class tcs3 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int unit=sc.nextInt();
        int n=sc.nextInt();
        int[] arr=new int[n];
        int sum=0;int count=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int q=r*unit;
        for(int i=0;i<arr.length;i++)
        {
           sum=sum+arr[i];
           count++;
           if(sum>=q)
           {
             System.out.println(count);
             break;
           }
        }
    }
}
