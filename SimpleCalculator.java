import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        int choice=sc.nextInt();
        switch(choice)
        {
            case 1:int c=a+b;System.out.println(c);break;
            case 2:int d=a-b;System.out.println(d);break;
            case 3:int e=a*b;System.out.println(e);break;
            case 4:int f=a/b;System.out.println(f);break;
            default:System.out.println("Invalid choice");
        }
    }
}
