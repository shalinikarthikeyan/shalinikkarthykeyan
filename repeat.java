import java.util.Scanner;

public class repeat {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++) {
            arr[i]=sc.nextInt();
        }
        int x=n;
        int y=-1;
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                if(arr[i]==arr[j]) {
                    x=i;
                    y=arr[i];
                    break;
            }
        }
        if(x!=n) {
            break;
        }
        if(x==n) {
            System.out.println("not found");
        }
        else{
            System.out.println(y);
        
        }
    }
} 
}
