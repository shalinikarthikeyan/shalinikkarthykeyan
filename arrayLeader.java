import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class arrayLeader {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        // int a=arr.length;
        int max=arr[n-1];
        // list.add(max);
        for(int num=n-2;num>=0;num--)
        {
            if(arr[num]>=max)
            {
              max=arr[num];
              list.add(max);
            }
        }
        Collections.reverse(list);
        System.out.print(list);
    }
    
}
