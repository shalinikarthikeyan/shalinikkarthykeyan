import java.util.Scanner;
public class dupicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.next(); 
        str = str.toLowerCase(); 
        sc.close();
        System.out.print("Duplicate characters: ");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) != str.lastIndexOf(ch) && str.indexOf(ch) == i) {
                System.out.print(ch + " ");
            }
        }
    }
}