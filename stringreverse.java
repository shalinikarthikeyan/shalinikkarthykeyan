import java.util.Scanner;

public class stringreverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char ch[]=s.toCharArray();

        for(int i=ch.length-1;i>=0;i--){
            System.out.print(ch[i]);
        }
    }
}
