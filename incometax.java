import java.util.Scanner;

public class incometax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int amount=sc.nextInt();
        int dependent=sc.nextInt();
        try{
            System.out.println(amount/dependent);
        }
        catch(Exception e)
        {
            System.out.println("Dependent cannot be zero");
        }
    }
}
