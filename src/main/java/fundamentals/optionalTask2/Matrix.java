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
        //  print(firstSort(matrix));
        //System.out.println("Max amount of decreasing numbers in a row: " + secondMaxAmountDecreasing(matrix));
        // System.out.println("Sum of numbers: " + thirdSumElements(matrix));
        System.out.println("Matrix without max digit: ");
        print(fourthDeleteRowColumnMatrix(matrix));

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

    public static int[][] firstSort(int[][] matrix) {
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

    public static int secondMaxAmountDecreasing(int[][] matrix) {
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

    public static int thirdSumElements(int[][] matrix) {

        int sum = 0;

        for (int[] array : matrix) {
            int index = 0;

            while (array[index] < 0 && index < array.length - 2) {
                index++;
            }
            if (index < array.length - 2) {
                index++;
                int subSum = 0;
                while (index < array.length - 1 && array[index] < 0) {
                    subSum += array[index];
                    index++;
                    if (array[index] < 0) {
                        sum += 0;
                    } else {
                        sum += subSum;
                    }
                }
            }
        }
        return sum;
    }

    public static int[][] fourthDeleteRowColumnMatrix(int[][] matrix) {


        int maxElement = 0;
        int indexRow = 0;
        int indexColumn = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (maxElement < matrix[i][j]) {
                    maxElement = matrix[i][j];
                    indexRow = i;
                    indexColumn = j;
                }
            }
        }
        int[][] newMatrix = new int[matrix.length - 1][matrix.length - 1];
        for (int i = 0; i < newMatrix.length; i++) {
            if (i < indexRow) {
                System.arraycopy(matrix[i], 0, newMatrix[i], 0, indexColumn);
                System.arraycopy(matrix[i], indexColumn + 1, newMatrix[i], indexColumn, matrix.length - 1 - indexColumn);
            } else {
                System.arraycopy(matrix[i + 1], 0, newMatrix[i], 0, indexColumn);
                System.arraycopy(matrix[i + 1], indexColumn + 1, newMatrix[i], indexColumn, matrix.length - 1 - indexColumn);
            }
        }
        System.out.println("indexRow: " + indexRow);
        System.out.println("indexColumn: " + indexColumn);
        System.out.println("maxElement: " + maxElement);

        return newMatrix;
    }


}
