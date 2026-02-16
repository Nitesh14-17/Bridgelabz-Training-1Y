public class NumberPropertiesChecker {
    
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    static boolean isNeon(int n) {
        int sq = n * n;
        int sum = 0;
        while (sq > 0) {
            sum += sq % 10;
            sq /= 10;
        }
        return sum == n;
    }
    
    static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    
    static int digitProduct(int n) {
        int prod = 1;
        while (n > 0) {
            prod *= n % 10;
            n /= 10;
        }
        return prod;
    }
    
    static boolean isSpy(int n) {
        return digitSum(n) == digitProduct(n);
    }
    
    static boolean isAutomorphic(int n) {
        int sq = n * n;
        String s1 = String.valueOf(n);
        String s2 = String.valueOf(sq);
        return s2.endsWith(s1);
    }
    
    static boolean isBuzz(int n) {
        return n % 7 == 0 || n % 10 == 7;
    }
    
    public static void main(String[] args) {
        int n = 13;
        
        System.out.println("Number: " + n);
        System.out.println("Is Prime: " + isPrime(n));
        System.out.println("Is Neon: " + isNeon(n));
        System.out.println("Is Spy: " + isSpy(n));
        System.out.println("Is Automorphic: " + isAutomorphic(n));
        System.out.println("Is Buzz: " + isBuzz(n));
    }
}
