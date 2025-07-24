import java.util.Scanner;
public class StringReversing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String reversed="";
        for(int i=s.length()-1;i>=0;i--)
        {
            reversed+=s.charAt(i);
        }
        System.out.println(reversed);
    }
}
