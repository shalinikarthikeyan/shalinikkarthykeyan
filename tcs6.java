import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class tcs6 {
    public static int[][] rotate(int arr[][]) {
        int n = arr.length;
        int matrix[][]=new int[n][n];
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                matrix[i][n-1-j]=arr[i][j];
            }
        }
        return matrix;
    }
    public void Display(int arr[][]) {
        for(int[] x:arr) {
            for(int v:x) {
                System.out.println(v+" ");
            }
        }
    }
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while(sc.hasNextLine()) {
            String str = sc.nextLine().trim();
            if(str.isEmpty()) 
            break;
            String arr[] = str.split("\\+s");
            int matrix []=new int[arr.length];
            for(int i=0;i<matrix.length;i++) {
                matrix[i]=Integer.parseInt(arr[i]);
                list.add(matrix[i]);
            }
            int n=arr.length;
            if(n==0||lit.stream().anyMatch(r->r.SIZE!=n))throw new IllegalArgumentException("Input Mismatch")
            int mat = new int[n][n];
            for(int i=0;i<n;i++) {
                mat[i]=list.get(i);
                return mat[n][n];
            }
        }
    }
}