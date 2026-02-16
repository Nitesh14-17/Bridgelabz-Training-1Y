public class PalindromeChecker {
    
    static int countDigits(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }
    
    static int[] storeDigits(int n) {
        int cnt = countDigits(n);
        int[] digits = new int[cnt];
        int idx = cnt - 1;
        while (n > 0) {
            digits[idx] = n % 10;
            n /= 10;
            idx--;
        }
        return digits;
    }
    
    static int[] reverseDigits(int[] digits) {
        int[] rev = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            rev[i] = digits[digits.length - 1 - i];
        }
        return rev;
    }
    
    static boolean arraysEqual(int[] a1, int[] a2) {
        if (a1.length != a2.length) {
            return false;
        }
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) {
                return false;
            }
        }
        return true;
    }
    
    static boolean isPalindrome(int n, int[] digits) {
        int[] rev = reverseDigits(digits);
        return arraysEqual(digits, rev);
    }
    
    static boolean isDuckNumber(int[] digits) {
        for (int d : digits) {
            if (d == 0) {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        int n = 121;
        int[] digits = storeDigits(n);
        
        System.out.println("Number: " + n);
        System.out.println("Is Palindrome: " + isPalindrome(n, digits));
        System.out.println("Is Duck Number: " + isDuckNumber(digits));
    }
}
