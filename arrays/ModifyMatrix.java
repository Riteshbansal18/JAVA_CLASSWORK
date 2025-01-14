package arrays;
import java.util.Scanner;
public class ModifyMatrix {
    public static void modifyMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
       int rowIndex = -1, colIndex = -1;
        boolean elementFound = false;
        outer:
        for (int i = 0; i < rows; i++)
         {
            for (int j = 0; j < cols; j++) 
            {
                if (matrix[i][j] != 0)
                 {
                    rowIndex = i;
                    colIndex = j;
                    elementFound = true;
                    break outer;
                }
            }
        }
        if (elementFound) 
        {
            for (int j = 0; j < cols; j++) 
            {
                if (j != colIndex) 
                {
                    matrix[rowIndex][j] = 1;
                }
            }
            for (int i = 0; i < rows; i++) 
            {
                if (i != rowIndex)
                 {
                    matrix[i][colIndex] = 1;
                }
            }
        }
    }
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter matrix elements :");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Original Matrix:");
        printMatrix(matrix);

        modifyMatrix(matrix);

        System.out.println("\nModified Matrix:");
        printMatrix(matrix);
        scanner.close();






    }
}
