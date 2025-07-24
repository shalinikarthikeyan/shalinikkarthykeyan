public class tcs4 {
    public static void main(String[] args) {
        int n1 = 11;
        int n2 = 15;

        int count = countUniqueDigitNumbers(n1, n2);
        System.out.println("Count = " + count);
    }

    static int countUniqueDigitNumbers(int n1, int n2) {
        int count = 0;
        for (int i = n1; i <= n2; i++) {
            if (hasUniqueDigits(i)) {
                count++;
            }
        }
        return count;
    }

    static boolean hasUniqueDigits(int num) {
        boolean[] digits = new boolean[10];
        while (num > 0) {
            int digit = num % 10;
            if (digits[digit]) {
                return false; // digit repeated
            }
            digits[digit] = true;
            num /= 10;
        }
        return true;
    }
}

