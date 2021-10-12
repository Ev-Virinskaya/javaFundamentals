package fundamentals.optionalTask1;

import java.util.Arrays;

public class SecondTaskNumbersSortedLength {
    public static void main(String[] args) {
        String longer;

        for (int i = 0; i < args.length; i++) {
            for (int j = i + 1; j < args.length; j++) {
                if (args[i].length() > args[j].length()) {
                    longer = args[i];
                    args[i] = args[j];
                    args[j] = longer;
                }
            }
        }
        System.out.println("Sorted by number length: " + Arrays.toString(args) + "\n");
    }
}
