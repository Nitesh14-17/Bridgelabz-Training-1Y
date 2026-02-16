public class HarshadNumberChecker {
    
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
    
    static int sumDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += d;
        }
        return sum;
    }
    
    static int sumSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, 2);
        }
        return sum;
    }
    
    static boolean isHarshad(int n, int[] digits) {
        int s = sumDigits(digits);
        return n % s == 0;
    }
    
    static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
            freq[i][1] = 0;
        }
        for (int d : digits) {
            freq[d][1]++;
        }
        return freq;
    }
    
    public static void main(String[] args) {
        int n = 21;
        int[] digits = storeDigits(n);
        
        System.out.println("Number: " + n);
        System.out.println("Digit Count: " + countDigits(n));
        System.out.println("Sum of Digits: " + sumDigits(digits));
        System.out.println("Sum of Squares: " + sumSquares(digits));
        System.out.println("Is Harshad Number: " + isHarshad(n, digits));
        
        System.out.println("\nDigit Frequency:");
        int[][] freq = digitFrequency(digits);
        for (int[] f : freq) {
            if (f[1] > 0) {
                System.out.println("Digit " + f[0] + ": " + f[1]);
            }
        }
    }
}
