package fundamentals.optionalTask1;

import java.util.Arrays;

public class SixthTaskNumbersAscendingOrder {
    public static void main (String[] args) {

        int indexNumber = -1;
        for (int i = 0; i < args.length; i++) {
            char[] chars = args[i].toCharArray();
            Arrays.sort(chars);

            for (int j = 0; j < chars.length - 1; j++) {
                if (chars[j] < chars[j + 1]) {
                    indexNumber = i;
                } else {
                    indexNumber = -1;
                    break;
                }
            }
            if (indexNumber >= 0) {
                System.out.println("The number with digits in strict ascending order: " + args[indexNumber]);
                break;
            }
        }
    }
}
