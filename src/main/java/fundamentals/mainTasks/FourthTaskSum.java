package fundamentals.mainTasks;

import java.util.Scanner;

public class FourthTaskSum {
    public static void main(String[] args) throws NumberFormatException {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        String input = scanner.nextLine();

        while (!input.equals("")) {
            sum += Integer.parseInt(input);
            input = scanner.nextLine();

        }
        System.out.println("Result: " + sum);
    }
}
