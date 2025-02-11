import java.util.Scanner;
public class add2matrixuserinput {

    public static int[][] addMatrices(int[][] matrixA, int[][] matrixB) {
        int rows = matrixA.length;
        int cols = matrixA[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static int[][] inputMatrix(int rows, int cols, Scanner sc) {
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter elements for the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        System.out.println("Input Matrix A:");
        int[][] matrixA = inputMatrix(rows, cols, sc);

        System.out.println("Input Matrix B:");
        int[][] matrixB = inputMatrix(rows, cols, sc);

        int[][] sumMatrix = addMatrices(matrixA, matrixB);

        System.out.println("Resultant Matrix after addition:");
        printMatrix(sumMatrix);
    }
}
    