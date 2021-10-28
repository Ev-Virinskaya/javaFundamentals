package fundamentals.optionalTask1;

import java.util.Arrays;

public class FourthTaskMinAmountSymbol {
    public static void main(String[] args) {

        int[] counts = new int[args.length];

        for (int j = 0; j < args.length; j++) {
            char[] chars = args[j].toCharArray();
            Arrays.sort(chars);
            int count = 1;
            for (int i = 0; i < chars.length - 1; i++) {
                if (chars[i] != chars[i + 1]) {
                    count++;
                }
            }
            int numberMinSymbol = 100 / count;
            counts[j] = numberMinSymbol;
        }

        int indexNumberMinSymbol = 0;
        for (int k = 0; k < counts.length; k++) {
            if(counts[indexNumberMinSymbol] == 100){
                indexNumberMinSymbol++;
            }
            if (counts[k] > counts[indexNumberMinSymbol] && counts[k] < 100) {
                indexNumberMinSymbol = k;
            }
        }
        System.out.println("The number with the least amount of different digits is minimal: " + args[indexNumberMinSymbol] + "\n");
    }
}
