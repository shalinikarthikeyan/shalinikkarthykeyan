import java.util.*;
public class xpatt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++)
        {
           for(int j=0;j<s.length();j++)
           {
            if(i==j)
            {
                System.out.print(s.charAt(j));
            }
            System.out.println();
           }
        }
        for(int i=0;i<s.length();i++)
        {
           for(int j=0;j<s.length();j++)
           {
            if(i+j==n-1)
            {
                System.out.print(s.charAt(j));
            }
            System.out.println();
           }
        }
    }
}
