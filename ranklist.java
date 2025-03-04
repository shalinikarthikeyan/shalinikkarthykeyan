import java.util.Scanner;

public class ranklist {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int d=sc.nextInt();
    int e=sc.nextInt();
    int pass=35;
    if(a>=35)
    {
        System.out.println("Tamil " +a+ " pass");
    }
    else
    {
        System.out.println("Tamil " +a+ " fail");
    }
    if(b>=35)
    {
        System.out.println("English " +b+ " pass");
    }
    else
    {
        System.out.println("English " +b+ " fail");
    }
    if(c>=35)
    {
        System.out.println("Maths " +a+" pass");
    }
    else
    {
        System.out.println("Maths " +a+ " fail");
    }
    if(d>=35)
    {
        System.out.println("Science " +a+ " pass");
    }
    else
    {
        System.out.println("Science " +a+ " fail");
    }
    if(e>=35)
    {
        System.out.println("social" +a+ " pass");
    }
    else
    {
        System.out.println("social " +a+ " fail");
    }
}
}
