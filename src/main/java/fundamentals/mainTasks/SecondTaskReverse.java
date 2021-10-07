package fundamentals.mainTasks;

public class SecondTaskReverse {
    public static void main(String[] args) {
        int j = args.length - 1;
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[j] + " ");
            j--;
        }
    }
}
