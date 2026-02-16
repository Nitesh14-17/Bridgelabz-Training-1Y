public class MatrixArithmetic {
    
    static int[][] createRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int)(Math.random() * 10);
            }
        }
        return matrix;
    }
    
    static int[][] addMatrices(int[][] m1, int[][] m2) {
        int[][] result = new int[m1.length][m1[0].length];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++) {
                result[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return result;
    }
    
    static int[][] subtractMatrices(int[][] m1, int[][] m2) {
        int[][] result = new int[m1.length][m1[0].length];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++) {
                result[i][j] = m1[i][j] - m2[i][j];
            }
        }
        return result;
    }
    
    static int[][] multiplyMatrices(int[][] m1, int[][] m2) {
        int[][] result = new int[m1.length][m2[0].length];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m2[0].length; j++) {
                int sum = 0;
                for (int k = 0; k < m1[0].length; k++) {
                    sum += m1[i][k] * m2[k][j];
                }
                result[i][j] = sum;
            }
        }
        return result;
    }
    
    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int[][] m1 = createRandomMatrix(2, 2);
        int[][] m2 = createRandomMatrix(2, 2);
        
        System.out.println("Matrix 1:");
        printMatrix(m1);
        
        System.out.println("\nMatrix 2:");
        printMatrix(m2);
        
        System.out.println("\nAddition:");
        printMatrix(addMatrices(m1, m2));
        
        System.out.println("\nSubtraction:");
        printMatrix(subtractMatrices(m1, m2));
        
        System.out.println("\nMultiplication:");
        printMatrix(multiplyMatrices(m1, m2));
    }
}
