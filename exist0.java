import java.util.Scanner;

public class exist0 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        String s=Integer.toString(n);
    
           for(char ch:s.toCharArray())
           {
            if(ch=='0')
            {
                System.out.println("exist 0");
                return;
            }
           }
           System.out.println("error");
        }
    }

