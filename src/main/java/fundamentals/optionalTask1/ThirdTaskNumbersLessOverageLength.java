package fundamentals.optionalTask1;

public class ThirdTaskNumbersLessOverageLength {
    public static void main(String[] args) {
        int sumLength = 0;
        for (String number : args) {
            sumLength += number.length();
        }
        int averageLength = sumLength / args.length;

        System.out.println(averageLength + " - is overage length" + "\n" + "Numbers whose length is less than the average length for all numbers: ");
        for (String number : args) {
            if (number.length() < averageLength) {
                System.out.print(number +" ");
            }
        }
        System.out.println();

        System.out.println("Numbers whose length is bigger than the average length for all numbers: ");
        for (String number : args) {
            if (number.length() > averageLength) {
                System.out.print(number +" ");
            }
        }
    }
}
