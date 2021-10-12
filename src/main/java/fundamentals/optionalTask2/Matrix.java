package fundamentals.optionalTask2;

import java.util.Random;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Set matrix size: ");
        int sizeMatrix = scanner.nextInt();
        System.out.println("Set digit to define the range of numbers to fill the matrix: ");
        int m = scanner.nextInt();

        int[][] matrix = new int[sizeMatrix][sizeMatrix];

        for (int i = 0; i < sizeMatrix; i++) {
            matrix[i] = new Random().ints(sizeMatrix, -m, m).toArray();
        }

        print(matrix);
        print(sort(matrix));
        System.out.println("Max amount of decreasing numbers in a row: " + maxAmountDecreasing(matrix));
    }

    public static void print(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int[][] sort(int[][] matrix) {
        System.out.println("Set column number from 0 to " + (matrix.length - 1) + " for sorting: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for (int i = 0; i < matrix.length - 1; i++) {
            for (int k = i + 1; k < matrix.length; k++) {
                if (matrix[i][number] > matrix[k][number]) {
                    for (int j = 0; j < matrix.length; j++) {
                        int temp = matrix[i][j];
                        matrix[i][j] = matrix[k][j];
                        matrix[k][j] = temp;
                    }
                }
            }
        }
        return matrix;
    }

    public static int maxAmountDecreasing(int[][] matrix) {
        int amount = 0;
        for (int[] ints : matrix) {
            int amountTemp = 1;
            for (int j = 0; j < matrix[0].length - 1; j++) {

                if (ints[j] > ints[j + 1]) {
                    amountTemp++;
                } else {
                    amount = Math.max(amount, amountTemp);
                    amountTemp = 1;
                }
            }
            amount = Math.max(amount, amountTemp);

        }
        return amount;
    }
}
