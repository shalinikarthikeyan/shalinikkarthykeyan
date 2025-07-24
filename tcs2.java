import java.util.Scanner;

public class tcs2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] temp = arr.clone();
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                if (i > 0) temp[i - 1] = 1;
                if (i < n - 1) temp[i + 1] = 1;
                temp[i] = 0;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(temp[i]);
        }

        sc.close();
    }
}

