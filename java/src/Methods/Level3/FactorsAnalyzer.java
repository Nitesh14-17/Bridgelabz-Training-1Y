public class FactorsAnalyzer {
    
    static int[] findFactors(int n) {
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                cnt++;
            }
        }
        
        int[] factors = new int[cnt];
        int idx = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors[idx] = i;
                idx++;
            }
        }
        return factors;
    }
    
    static int greatestFactor(int[] factors) {
        return factors[factors.length - 1];
    }
    
    static long sumFactors(int[] factors) {
        long sum = 0;
        for (int f : factors) {
            sum += f;
        }
        return sum;
    }
    
    static long productFactors(int[] factors) {
        long prod = 1;
        for (int f : factors) {
            prod *= f;
        }
        return prod;
    }
    
    static long productCubeFactors(int[] factors) {
        long prod = 1;
        for (int f : factors) {
            prod *= Math.pow(f, 3);
        }
        return prod;
    }
    
    public static void main(String[] args) {
        int n = 12;
        int[] factors = findFactors(n);
        
        System.out.println("Number: " + n);
        System.out.print("Factors: ");
        for (int f : factors) {
            System.out.print(f + " ");
        }
        System.out.println();
        
        System.out.println("Greatest Factor: " + greatestFactor(factors));
        System.out.println("Sum of Factors: " + sumFactors(factors));
        System.out.println("Product of Factors: " + productFactors(factors));
        System.out.println("Product of Cubes: " + productCubeFactors(factors));
    }
}
