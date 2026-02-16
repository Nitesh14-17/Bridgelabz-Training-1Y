public class DuckArmstrongChecker {
    
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
    
    static boolean isDuckNumber(int[] digits) {
        for (int d : digits) {
            if (d == 0) {
                return true;
            }
        }
        return false;
    }
    
    static boolean isArmstrongNumber(int n, int[] digits) {
        int cnt = digits.length;
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, cnt);
        }
        return sum == n;
    }
    
    static int findLargest(int[] digits) {
        int l1 = Integer.MIN_VALUE;
        int l2 = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > l1) {
                l2 = l1;
                l1 = d;
            } else if (d > l2) {
                l2 = d;
            }
        }
        System.out.println("Largest: " + l1 + ", Second Largest: " + l2);
        return l1;
    }
    
    static int findSmallest(int[] digits) {
        int s1 = Integer.MAX_VALUE;
        int s2 = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < s1) {
                s2 = s1;
                s1 = d;
            } else if (d < s2) {
                s2 = d;
            }
        }
        System.out.println("Smallest: " + s1 + ", Second Smallest: " + s2);
        return s1;
    }
    
    public static void main(String[] args) {
        int n = 153;
        int[] digits = storeDigits(n);
        
        System.out.println("Number: " + n);
        System.out.println("Digit Count: " + countDigits(n));
        System.out.println("Is Duck Number: " + isDuckNumber(digits));
        System.out.println("Is Armstrong Number: " + isArmstrongNumber(n, digits));
        findLargest(digits);
        findSmallest(digits);
    }
}
