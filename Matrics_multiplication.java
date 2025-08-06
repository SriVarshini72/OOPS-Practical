 package example;
public class Matrics_multiplication {
    public static void main(String[] args) {
        // Define two matrices
        int[][] matrixA = {
            {1, 2, 3},
            {4, 5, 6}
        };
        
        int[][] matrixB = {
            {7, 8},
            {9, 10},
            {11, 12}
        };
        
        // Result matrix of size rows of A x columns of B
        int[][] result = new int[matrixA.length][matrixB[0].length];
        
        // Multiply matrices
        for (int i = 0; i < matrixA.length; i++) { // rows of A
            for (int j = 0; j < matrixB[0].length; j++) { // columns of B
                for (int k = 0; k < matrixA[0].length; k++) { // columns of A / rows of B
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        
        // Print the result
        System.out.println("Result of matrix multiplication:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}

