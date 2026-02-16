public class MatrixTransformations {
    
    static int[][] createRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int)(Math.random() * 10);
            }
        }
        return matrix;
    }
    
    static int[][] transposeMatrix(int[][] matrix) {
        int[][] result = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }
    
    static double determinant2x2(int[][] matrix) {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }
    
    static double determinant(int[][] matrix) {
        if (matrix.length == 2 && matrix[0].length == 2) {
            return determinant2x2(matrix);
        }
        return 0;
    }
    
    static double[][] inverse2x2(int[][] matrix) {
        double det = determinant(matrix);
        if (det == 0) {
            return null;
        }
        
        double[][] result = new double[2][2];
        result[0][0] = matrix[1][1] / det;
        result[0][1] = -matrix[0][1] / det;
        result[1][0] = -matrix[1][0] / det;
        result[1][1] = matrix[0][0] / det;
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
    
    static void printDoubleMatrix(double[][] matrix) {
        if (matrix == null) {
            System.out.println("Matrix is singular (inverse does not exist)");
            return;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(String.format("%.2f ", matrix[i][j]));
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int[][] matrix = createRandomMatrix(2, 2);
        
        System.out.println("Original Matrix:");
        printMatrix(matrix);
        
        System.out.println("\nTranspose:");
        printMatrix(transposeMatrix(matrix));
        
        System.out.println("\nDeterminant: " + determinant(matrix));
        
        System.out.println("\nInverse:");
        double[][] inv = inverse2x2(matrix);
        printDoubleMatrix(inv);
    }
}
