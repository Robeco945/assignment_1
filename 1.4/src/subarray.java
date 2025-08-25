import java.util.Scanner;
public class subarray {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the array length: ");
        int length = scanner.nextInt();
        int[] numbers = new int[length];
        for (int i = 0; i<length; i++) {
            int max = Integer.MIN_VALUE;
            for (int start = 0; start < numbers.length; start++) {
                for (int end = start; end < numbers.length; end++) {

                }
            }
            System.out.print("Enter character number "+ (i+1) + ": ");
            numbers[i] = scanner.nextInt();
        }
    }
}
