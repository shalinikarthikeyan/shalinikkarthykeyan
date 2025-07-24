import java.util.*;

public class tcs5 {
    public static void main(String[] args) {
        // Sample Input
        int[] arr = {10, 12, 5, 40, 30, 7, 50, 9, 10};
        int n = arr.length;

        
        rearrangeArray(arr, n);

      
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    static void rearrangeArray(int[] arr, int n) {
        List<Integer> nonMultiples = new ArrayList<>();
        List<Integer> multiples = new ArrayList<>();

        
        for (int num : arr) {
            if (num % 10 == 0) {
                multiples.add(num);
            } else {
                nonMultiples.add(num);
            }
        }

       
        int index = 0;
        for (int num : nonMultiples) {
            arr[index++] = num;
        }
        for (int num : multiples) {
            arr[index++] = num;
        }
    }
}

