import java.util.Scanner;
public class subarray {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the array length: ");
        int length = scanner.nextInt();
        int[] numbers = new int[length];
        int max = 0;
        int maxstart = 0;
        int maxend = 0;
        int cursum = 0;
        for (int i = 0; i < length; i++) {
            System.out.print("Enter character number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
            max = Integer.MIN_VALUE;
            for (int start = 0; start < numbers.length; start++) {
                cursum = 0;
                for (int end = start; end < numbers.length; end++) {
                    cursum += numbers[end];
                    if (cursum > max) {
                        max = cursum;
                        maxstart = start;
                        maxend = end;
                    }
                }
            }
        System.out.println("max sum is: " + max);
            System.out.println("Integer: " + (maxstart+1) + "-" + (maxend+1));
    }
    }


