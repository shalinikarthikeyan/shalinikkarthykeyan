import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        try{
            System.out.println(a[4]);
        }
        catch(Exception e){
            System.out.println(" Index out of bounds! Valid range is 0 to 4.");

        }
    }
}
