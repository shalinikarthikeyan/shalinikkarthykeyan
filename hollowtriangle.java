// import java.util.*;
// public class ypattern {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=0;i<n;i++)
//         {
//             for(int space=0;space<(n-i);space++)
//             {
//                 System.out.print(" ");
//             }
//             for(int j=0;j<=i;j++)
//             {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }
//hollow Triangle
import java.util.*;
public class hollowtriangle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int space=0;space<(n-i-1);space++)
            {
                System.out.print(" ");
            }
            if(i==0)
            {
                System.out.println("*");
            }
            else if(i==n-1)
            {
                for(int j=0;j<2*i+1;j++){
                if(j%2==0){
                System.out.print("*");}
                else{
                System.out.print(" ");
                }
                
                }
                System.out.println();
            }
            else
            {
                System.out.print("*");
                for(int j=0;j<2*i-1;j++)
                {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
            
        }
    }
}