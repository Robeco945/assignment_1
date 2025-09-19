import java.util.Scanner;
public class prime {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the starting number");
        int start = Integer.parseInt((scanner.nextLine()));
        System.out.println("Enter the ending number (must be larger than the starting number)");
        int end = Integer.parseInt((scanner.nextLine()));
        while (end <= start) {
            System.out.println("please enter a number that is larger than the staring number");
            end = Integer.parseInt((scanner.nextLine()));
            if (end > start) {
                break;
            }
        }
        for (int n = start; n <= end; n++) {
            if (n <= 1){continue;}
            boolean isprime = true;
            for (int i = 2; i <= n - 1; i++) {
                if (n % i == 0) {
                    isprime = false;
                    //System.out.println(n);
                    //System.out.println("i "+i);
                    break;}}
                if (isprime) {
                    System.out.println(n);
            }
        }
    }
}




