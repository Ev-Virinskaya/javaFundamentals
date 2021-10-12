package fundamentals.optionalTask1;

public class FirstTaskShortestLongestNumber {
    public static void main (String[] args) {
        int maxLength = 0;
        int minLength = 0;

        for (int i = 0; i < args.length; i++) {
            if (args[i].length() < args[minLength].length()) {
                minLength = i;
            } else if (args[i].length() > args[maxLength].length()) {
                maxLength = i;
            }
        }
        System.out.println("The shortest number: " + args[minLength] + "\n" + "Number length: " + args[minLength].length());
        System.out.println("The longest number: " + args[maxLength] + "\n" + "Number length: " + args[maxLength].length() + "\n");
    }
}
