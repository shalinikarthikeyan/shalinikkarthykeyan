import java.util.Scanner;

public class array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int a[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
               System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        int sum=sc.nextInt();
        int add=0;
        int plus=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
              if(i==j)
              {
                // System.out.print(a[i][j]+" ");
                add=add+a[i][j];
              }
              
            }
        }
        System.out.println();
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
              if(i+j==r-1){
                // System.out.print(a[i][j]+" ");
                plus=plus+a[i][j];
              }
              
            }
        }
        if(sum==add && sum==plus)
        {
        for(int i=0;i<r;i++)
        {
            int summation=0;
            int solution=0;
            for(int j=0;j<c;j++)
            {
                summation=summation+a[i][j];
                solution=solution+a[j][i];
            }  
            if(sum==summation && sum==solution)
            {
                System.out.println("Magic Matrix");
            }
            else{
                System.out.println("Not a Magic Matrix");
            }
        }
    }  
    }
}
