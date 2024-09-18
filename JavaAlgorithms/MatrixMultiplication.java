/**
This is Algorithm 1.4 Matrix Multiplication
Needs Work

Author: James Lee
Source Code in ReadMe File 
*/

import java.util.Arrays;

public class MatrixMultiplication {

    // Method to perform matrix multiplication
    public static int[][] matrixMult(int[][] A, int[][] B) {
        int m = A.length;       
        int k = A[0].length;    
        int n = B[0].length;    

        // Initialize the result matrix with zeros
        int[][] C = new int[m][n];

        // Perform matrix multiplication
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int l = 0; l < k; l++) {
                    C[i][j] += A[i][l] * B[l][j];
                }
            }
        }

        return C;
    }
 
    public static void main(String[] args) {
        // Define matrices A and B
        int[][] A = {{2, 3}, {4, 1}};
        int[][] B = {{5, 7}, {6, 8}};
        int[][] C;
        
        C = matrixMult(A, B);
        System.out.println(Arrays.deepToString(C));

    }

}
