import java.util.Scanner;

public class deckofcards1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String a[]=new String[n];
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.next();
        }
        try{
            System.out.println(a[6]);
        }
        catch(Exception e){
            System.out.println("Invalid card index!");

        }
    }
}
