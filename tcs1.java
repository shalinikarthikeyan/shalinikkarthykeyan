import java.util.Scanner;

public class tcs1 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
       String s=str.replaceAll("[^a-zA-Z]", "");
        int sum=0;
        for(char ch:s.toCharArray())
        {
            Character.toLowerCase(ch);
            sum=sum+ch-'a'+1;
        }
        while(sum>=10){

            int temp=0;
            while(sum>0)
            {
              temp=temp+sum%10;
              sum/=10;  
            }
            System.out.println(temp);
        }
    }
}
