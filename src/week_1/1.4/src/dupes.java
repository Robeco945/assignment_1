import java.util.Scanner;
public class dupes {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the array length: ");
        int length = scanner.nextInt();
        int[] numbers = new int[length];
        int[] dupeless = new int[length];
        boolean dupe = false;
        int k = 0;
        for (int i = 0; i < length; i++) {
            System.out.print("Enter character number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        for (int n = 0; n < length; n++) {
            dupe = false;
            for (int j = 0; j < length; j++) {
                if (numbers[n] == dupeless[j]) {
                    dupe = true;
                    break;
                }
            }
            if (!dupe) {
                dupeless[k] = numbers[n];
                k++;
            }
        }
        System.out.println("Array without duplicates: ");
        for (int p = 0; p< k; p++) {
            System.out.println(dupeless[p]);

        }
    }
}



