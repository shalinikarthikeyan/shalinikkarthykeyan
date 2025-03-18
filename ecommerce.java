import java.util.Scanner;

public class ecommerce {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s[] =new String[n];
        for(int i=0;i<s.length;i++)
        {
            s[i]=sc.next();
        }
        try{
            System.out.println(s[6]);
        }
        catch(Exception e){
            System.out.println("No order exists at this index.");

        }
    }
}
