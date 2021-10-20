package fundamentals.optionalTask1;

public class FifthTaskFindEvenNumbers {
    public static void main(String[] args) {

        int countEvenNumbers = 0;
        int countNumbersEqualEvenOdd = 0;
        for (String arg : args) {
            char[] chars = arg.toCharArray();
            int countEvenDigits = 0;
            int countOddDigits = 0;
            for (char aChar : chars) {
                if (aChar % 2 == 0) {
                    countEvenDigits++;
                } else {
                    countOddDigits++;
                }
            }
            if (countEvenDigits == chars.length) {
                countEvenNumbers++;
            } else if (countEvenDigits + countOddDigits == chars.length && countEvenDigits == countOddDigits) {
                countNumbersEqualEvenOdd++;
            }

        }

        System.out.println("Amount of numbers with even digits: " + countEvenNumbers);
        System.out.println("Amount of numbers with the same number of odd and even digits: " + countNumbersEqualEvenOdd);
    }
}
