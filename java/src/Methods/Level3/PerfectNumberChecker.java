public class PerfectNumberChecker {
    
    static int sumProperDivisors(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
    
    static boolean isPerfectNumber(int n) {
        return sumProperDivisors(n) == n;
    }
    
    static boolean isAbundantNumber(int n) {
        return sumProperDivisors(n) > n;
    }
    
    static boolean isDeficientNumber(int n) {
        return sumProperDivisors(n) < n;
    }
    
    static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    
    static boolean isStrongNumber(int n) {
        int temp = n;
        int sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == n;
    }
    
    public static void main(String[] args) {
        int n = 6;
        
        System.out.println("Number: " + n);
        System.out.println("Is Perfect Number: " + isPerfectNumber(n));
        System.out.println("Is Abundant Number: " + isAbundantNumber(n));
        System.out.println("Is Deficient Number: " + isDeficientNumber(n));
        System.out.println("Is Strong Number: " + isStrongNumber(n));
    }
}
