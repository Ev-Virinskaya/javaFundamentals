package fundamentals.mainTasks;

import java.util.Arrays;
import java.util.Scanner;

public class ThirdTaskRandomNumbers {
    public static void main(String[] args) {
        System.out.println("Enter amount of numbers: ");
        Scanner scan = new Scanner(System.in);
        int amount = scan.nextInt();
        int[] array = new int[amount];
        System.out.println("Result in column: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.println(array[i]);
        }
        System.out.println();
        System.out.println("Result in row: ");
        System.out.println(Arrays.toString(array));
    }
}
