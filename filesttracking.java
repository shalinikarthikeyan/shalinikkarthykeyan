import java.util.Scanner;

public class filesttracking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int[] tracked=new int[m];
        for(int i=0;i<m;i++)
        {
            tracked[i]=sc.nextInt();
        }
        int[] ignored=new int[k];
        for(int i=0;i<k;i++)
        {
            ignored[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<k;j++)
            {
                if(tracked[i]==ignored[j])
                {
                    count++;
                }
            }
        }
        int count1=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<k;j++)
            {
                // write the 
            }
        }
    }
}
