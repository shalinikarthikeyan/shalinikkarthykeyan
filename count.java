import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int cout=0;
        int temp=n;
        while(temp!=0)
        {
            temp=temp/10;
            cout++;
        }
        System.out.println(cout);
    }
}
